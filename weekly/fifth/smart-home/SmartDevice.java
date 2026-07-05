public abstract class SmartDevice {
    String name;
    boolean isOn;
    double basePower;

    public SmartDevice(String name, double basePower) {
        this.name = name;
        this.basePower = basePower;
        this.isOn = false;
    }

    public abstract double calculatePowerConsumption();
    public abstract void showSpecificFeature();

    public final void printInfo() {
        double power = calculatePowerConsumption();
        System.out.println(name + " - " + (isOn ? "ON" : "OFF") + " - Power: " + power);
    }
}