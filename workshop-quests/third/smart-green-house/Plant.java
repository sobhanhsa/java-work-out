public class Plant {
    private String name;
    private String species;
    private int growthStage;
    private int waterLevel;
    private boolean isBlooming;

    public Plant(String name, String species) {
        this(name, species, 0, 20);
    }

    public Plant(String name, String species, int growthStage, int waterLevel) {
        this.name = name;
        this.species = species;
        this.growthStage = Math.min(5, growthStage);
        this.waterLevel = Math.max(0, Math.min(100, waterLevel));
        this.isBlooming = (this.growthStage == 5);
    }

    public void water(int amount) {
        waterLevel += amount;
        if (waterLevel > 100)
            waterLevel = 100;
    }

    public void water(int amount, boolean fromSensor) {
        water(amount);
    }

    public void grow() {
        if (waterLevel < 20)
            return;

        if (growthStage < 5) {
            growthStage++;
        }

        if (growthStage == 5) {
            isBlooming = true;
        }
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getGrowthStage() {
        return growthStage;
    }

    public boolean isBlooming() {
        return isBlooming;
    }
}
