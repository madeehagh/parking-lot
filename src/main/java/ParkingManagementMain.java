import service.SystemInitialisation;

public class ParkingManagementMain {

    public static void main(String[] args) {
        SystemInitialisation systemInitialisation = new SystemInitialisation();
        systemInitialisation.processInputFile();
    }
}