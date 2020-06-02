package service;

import entity.RateCard;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static entity.ParkingLot.parkingLot;


public class ParkingManagementEngine {
    private Map<Integer, String> parkingDetail;
    private Map<String, RateCard> userCarRates;

    public ParkingManagementEngine() {
        parkingDetail = new HashMap<>();
        userCarRates = new HashMap<>();
    }

    public void createParkingSlot(String carNum) {
        if (null == carNum)
            System.out.println("Invalid Car Number");
        int availableSlot = checkAvailabilityOfParkingLot(parkingLot);
        if (availableSlot != -1 ) {
            long startTime = System.currentTimeMillis();
            parkingDetail.putIfAbsent(availableSlot, carNum);
            updateRateForVehicle(carNum, startTime);
            parkingLot[availableSlot]++;
            System.out.println("Allocated slot number: " + (availableSlot + 1));
        } else {
            System.out.println("Sorry, parking lot is full");
        }
    }

    private void updateRateForVehicle(String carNum, long startTime) {
        RateCard rateCard = new RateCard(startTime);
        userCarRates.put(carNum, rateCard);
    }

    private int checkAvailabilityOfParkingLot(int[] parkingList) {
        for (int i =0; i<parkingList.length; i++) {
            if (parkingList[i] == 0)
                return i;
        }
        return -1;
    }

    public void showStatus() {
            if (parkingDetail.size() == 0)
                System.out.println("All slots are available");
        System.out.println("Slot No.  Registration No.");
            parkingDetail.forEach((k,v) -> {
                System.out.println(k+1 + "  " + v);
            });
    }

    public void leaveSlot(String vehicleNum, int slotNum) {
        if (null == vehicleNum){
            System.out.println("Invalid Car Number " + vehicleNum);
        }
        RateCard rateCard = null;
        long endTime = System.currentTimeMillis();
        if (userCarRates.containsKey(vehicleNum)) {
            rateCard = userCarRates.get(vehicleNum);
        } else {
            System.out.println("Registration number " + vehicleNum + " not found");
            return;
        }
        long dif = TimeUnit.MILLISECONDS.toHours(endTime - rateCard.getStart());
        double charge = dif == 0 ? rateCard.getAmount() : rateCard.getAmount() * dif;
        userCarRates.remove(vehicleNum);
        parkingDetail.remove(slotNum);
        parkingLot[slotNum-1] = 0;
        System.out.println(vehicleNum + " with Slot Number " + slotNum + " is free with Charge " + charge);
    }
}