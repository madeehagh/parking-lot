package service;

import entity.ParkingLot;
import enums.CommandTypes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class SystemInitialisation {
    ParkingManagementEngine parkingManagementEngine = new ParkingManagementEngine();

    public  void processInputFile() {
        Iterator it = null;
        try {
            it = Files.readAllLines(new File("src/main/resources/input.txt").toPath()).iterator();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (it.hasNext()) {
            String input = (String) it.next();
            doProcess(input);
        }
    }

    protected void doProcess(String input) {
        String vehicleNum;
        String[] split = input.split(" ");
        switch (CommandTypes.valueOf(split[0])) {
            case create_parking_lot:
                int numSlot = Integer.parseInt(split[1]);
                ParkingLot.parkingLot = new int[numSlot];
                break;

            case park:
                vehicleNum = split[1];
                parkingManagementEngine.createParkingSlot(vehicleNum);
                break;

            case leave:
                vehicleNum = split[1];
                int slotNum = Integer.parseInt(split[2]);
                parkingManagementEngine.leaveSlot(vehicleNum, slotNum);
                break;

            case status:
                parkingManagementEngine.showStatus();
                break;

            default:
                System.out.println("Incorrect Input");
                break;
        }
    }
}
