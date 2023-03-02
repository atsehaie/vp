package virtual_pet;

public class Robotic extends VirtualPet {
    private String name;
    private int maintenanceNeeded = 0;
    private int oilNeeded = 0;

    public Robotic(String name, int oilNeeded, int maintenanceNeeded) {
        super(name);
        this.name = name;
        this.oilNeeded = oilNeeded;
        this.maintenanceNeeded = maintenanceNeeded;
    }

    public int getOilNeeded() {
        return oilNeeded;
    }

    public int getMaintenanceNeeded() {
        return maintenanceNeeded;
    }


    public void increaseOilNeeded() {
        oilNeeded++;
    }

    public void increaseMaintenanceNeeded() {
        maintenanceNeeded++;
    }

    public void walk() {
        increaseOilNeeded();
        increaseMaintenanceNeeded();
    }

    public void tick() {
        this.oilNeeded++;
        this.maintenanceNeeded++;
    }
}
