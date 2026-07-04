class Pot {
    private int potId;
    private int capacity;
    private Plant currentPlant;
    private int moistureLevel;

    public Pot(int potId, int capacity) {
        this.potId = potId;
        this.capacity = capacity > 0 ? capacity : 1;
        this.moistureLevel = 0;
    }

    public boolean assignPlant(Plant plant) {
        if (this.currentPlant != null)
            return false;

        this.currentPlant = plant;
        return true;
    }

    public Plant removePlant() {
        Plant temp = this.currentPlant;
        this.currentPlant = null;
        return temp;
    }

    public void waterPot(int amount) {
        this.moistureLevel += amount;

        if (this.moistureLevel > 100)
            this.moistureLevel = 100;
        if (this.moistureLevel < 0)
            this.moistureLevel = 0;

        if (this.currentPlant != null)
            this.currentPlant.water(amount);
    }

    public int getMoistureLevel() {
        return this.moistureLevel;
    }

    public Plant getCurrentPlant() {
        return this.currentPlant;
    }

    public String getStatus() {
        if (this.currentPlant == null)
            return "Empty Pot";

        return "Pot " + this.potId + " Moisture:";
    }
}