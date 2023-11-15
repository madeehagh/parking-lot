package parkingSpot;

import vehicle.Vehicle;

public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree() {
        return isFree;
    }

    public abstract boolean assignVehicle(Vehicle vehicle);
    public boolean removeVehicle(){
        // definition
        return true;
    }
}
