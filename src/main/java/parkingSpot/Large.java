package parkingSpot;

import vehicle.Vehicle;

public class Large extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}
