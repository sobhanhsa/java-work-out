class Sensor {
    private int sensorId;
    // we can also implement with enum SensorType { MOISTURE, TEMPERATURE}
    private String sensorType;
    private boolean isCalibrated;

    public Sensor(int sensorId, String sensorType) {
        this.sensorId = sensorId;
        this.sensorType = sensorType;
        isCalibrated = false;
    }

    public void calibrate() {
        isCalibrated = true;
    }

    public int read() {
        if (!isCalibrated){
            System.out.println("Sensor " + sensorId + " is not calibrated.");
            return -1;
        }

        return 0;
    }

    public int read(Pot pot) {
        if (!isCalibrated){
            System.out.println("Sensor " + sensorId + " is not calibrated.");
            return -1;
        }

        if (sensorType.equals("MOISTURE"))
            return pot.getMoistureLevel();

        return 0;
    }
}