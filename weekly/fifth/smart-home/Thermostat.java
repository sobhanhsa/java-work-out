public class Thermostat extends SmartDevice {
    int temperature;

    public Thermostat(String name, double basePower, int temperature, boolean isOn) {
        super(name, basePower);
        this.temperature = temperature;
        this.isOn = isOn;
    }

    @Override
    public double calculatePowerConsumption() {
        if (!isOn) return 0;
        return basePower * (1 + Math.abs(temperature - 22) / 20.0);
    }

    @Override
    public void showSpecificFeature() {
        System.out.println("Temperature: " + temperature);
    }
}