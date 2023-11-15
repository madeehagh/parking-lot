package service;

import componenets.Entrance;
import componenets.Exit;
import componenets.ParkingRate;
import parkingSpot.ParkingSpot;
import ticket.ParkingTicket;
import vehicle.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotService {
    private int id;
    private String name;
    private String address;
    private ParkingRate parkingRate;

    private Map<String, Entrance> entranceMap;
    private Map<String, Exit> exitMap;

    //Map that identifies all currently generated tickets using their ticket number
    private Map<String, ParkingTicket> parkingTicketMap;

    // The ParkingLot is a singleton class that ensures it will have only one active instance at a time
    // Both the Entrance and Exit classes use this class to create and close parking tickets
    private static ParkingLotService parkingLotService = null;

    private ParkingLotService() {
        entranceMap = new HashMap<>();
        exitMap = new HashMap<>();
        parkingTicketMap = new HashMap<>();
    }

    public static ParkingLotService getInstance() {
        if (parkingLotService == null)
            parkingLotService = new ParkingLotService();
        return parkingLotService;
    }
    public boolean addEntrance(Entrance entrance){
        return false;
    }

    public boolean addExit(Exit exit){
        return false;
    }

    // This function allows parking tickets to be available at multiple entrances
    public ParkingTicket getParkingTicket(Vehicle vehicle) {}

    public boolean isFull(ParkingSpot type){}

}

