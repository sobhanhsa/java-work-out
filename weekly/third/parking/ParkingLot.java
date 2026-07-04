import java.util.ArrayList;

public class ParkingLot {
    private int capacity;
    private ArrayList<Car> cars;
    private static double totalRevenue = 0;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        cars = new ArrayList<>();
    }

    public boolean park(Car car) {
        if (cars.size() >= capacity) {
            return false;
        }
        cars.add(car);
        return true;
    }

    public boolean park(Car car, boolean VIP) {
        if (cars.size() >= capacity && !VIP) {
            return false;
        }
        cars.add(car);
        return true;
    }

    public double exitCar(String plate, int minutes) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);

            if (car.getPlate().equals(plate)) {
                car.setParkedTime(minutes);

                double cost = minutes * 2.0;

                if (car.getIsElectric()) {
                    cost *= 0.85;
                }

                totalRevenue += cost;
                cars.remove(i);

                return cost;
            }
        }

        System.out.print("unknown plate");
        return -1;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}