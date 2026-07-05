public class Light extends SmartDevice {
    int brightness;

    public Light(String name, double basePower, int brightness, boolean isOn) {
        super(name, basePower);
        this.brightness = brightness;
        this.isOn = isOn;
    }

    @Override
    public double calculatePowerConsumption() {
        if (!isOn) return 0;
        return basePower + (brightness / 10.0);
    }

    @Override
    public void showSpecificFeature() {
        System.out.println("Brightness: " + brightness);
    }
}