package parkingSpot;

import vehicle.Vehicle;

public class MotorCycle extends ParkingSpot{
    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}
