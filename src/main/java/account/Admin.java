package account;

import componenets.DisplayBoard;
import componenets.Entrance;
import componenets.Exit;
import parkingSpot.ParkingSpot;

public class Admin extends Account{
    // spot here refers to an instance of the ParkingSpot class
    public boolean addParkingSpot(ParkingSpot spot){

    }
    // displayBoard here refers to an instance of the componenets.DisplayBoard class
    public boolean addDisplayBoard(DisplayBoard displayBoard){

    }
    // entrance here refers to an instance of the Entrance class
    public boolean addEntrance(Entrance entrance){

    }
    // exit here refers to an instance of the Exit class
    public boolean addExit(Exit exit){

    }
    @Override
    public boolean resetPassword() {
        return false;
    }
}
