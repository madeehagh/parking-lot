package parkingSpot;

import vehicle.Vehicle;

public class Compact extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}
