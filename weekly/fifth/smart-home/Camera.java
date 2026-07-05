public class Camera extends SmartDevice {
    String quality;

    public Camera(String name, double basePower, String quality, boolean isOn) {
        super(name, basePower);
        this.quality = quality;
        this.isOn = isOn;
    }

    private double getQualityFactor() {
        switch (quality) {
            case "low": return 0.1;
            case "medium": return 0.2;
            case "high": return 0.5;
            default: return 0;
        }
    }

    @Override
    public double calculatePowerConsumption() {
        if (!isOn) return 0;
        return basePower * (1 + getQualityFactor());
    }

    @Override
    public void showSpecificFeature() {
        System.out.println("Quality: " + quality);
    }
}