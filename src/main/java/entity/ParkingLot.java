package entity;

public class ParkingLot {

    private int level;
    private String vehicleNumber;
    private int numOfSlots;
    public static int[] parkingLot;

    public ParkingLot(int numOfSlots) {
        this.numOfSlots = numOfSlots;
        parkingLot = new int[numOfSlots];
        System.out.println("Created parking lot with "+ numOfSlots +" slots ");
    }

    public ParkingLot(int level, String vehicleNumber) {
        this.level = level;
        this.vehicleNumber = vehicleNumber;
    }

    public int getLevel() {
        return level;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public static int[] getParkingLot() {
        return parkingLot;
    }
}