public class Car {
    private String plate;
    private boolean isElectric;
    private int parkedTime;

    public Car(String plate, boolean isElectric) {
        this.plate = plate;
        this.isElectric = isElectric;
        this.parkedTime = 0;
    }

    public String getPlate() {
        return plate;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public int getParkedTime() {
        return parkedTime;
    }

    public void setParkedTime(int parkedTime) {
        if (parkedTime >= 0) {
            this.parkedTime = parkedTime;
        }
    }
}