import java.util.ArrayList;

class Greenhouse {
    private ArrayList<Pot> pots;
    private ArrayList<Sensor> sensors;
    private int maxPots;

    public Greenhouse(int maxPots) {
        this.maxPots = maxPots;
        pots = new ArrayList<Pot>();
        sensors = new ArrayList<Sensor>();
    }

    public boolean addPot(Pot pot) {
        if (pots.size() >= maxPots)
            return false;

        pots.add(pot);
        return true;
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public void runDailyCycle(int sunlightHours, int waterAmount) {
        for (Pot pot : pots) {
            pot.waterPot(waterAmount);

            if (sunlightHours >= 4 && pot.getCurrentPlant() != null) {
                pot.getCurrentPlant().grow();
            }
        }
    }

    public void printReport() {
        printReport(false);
    }

    public void printReport(boolean detailed) {
        for (Pot pot : pots) {
            System.out.println(pot.getStatus());

            if (detailed && pot.getCurrentPlant() != null) {
                Plant p = pot.getCurrentPlant();
                System.out.println("Growth Stage: " + p.getGrowthStage());
                System.out.println("Water Level: " + p.getWaterLevel());
                System.out.println("Blooming: " + p.isBlooming());
            }
        }
    }
}