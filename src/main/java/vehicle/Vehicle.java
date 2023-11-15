package vehicle;

import ticket.ParkingTicket;

public abstract class Vehicle {
    private int licenseNo;
    public abstract void assignTicket(ParkingTicket ticket);
}
