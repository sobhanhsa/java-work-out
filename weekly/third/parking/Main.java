import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int q = sc.nextInt();

        ParkingLot parking = new ParkingLot(capacity);

        for (int i = 0; i < q; i++) {
            String command = sc.next();

            switch (command) {
                case "ENTER":
                    String plate = sc.next();
                    boolean electric = sc.nextBoolean();

                    Car car = new Car(plate, electric);

                        if (!parking.park(car)) {
                        System.out.println("Parking Full");
                    }
                    break;

                case "VIP_ENTER":
                    plate = sc.next();
                    electric = sc.nextBoolean();

                    car = new Car(plate, electric);
                    parking.park(car, true);
                    break;

                case "EXIT":
                    plate = sc.next();
                    int minutes = sc.nextInt();

                    double cost = parking.exitCar(plate, minutes);

                    if (cost != -1) {
                        System.out.printf("Car %s exited. Cost: %.2f%n", plate, cost);
                    }
                    break;

                case "REVENUE":
                    System.out.printf("%.2f%n", ParkingLot.getTotalRevenue());
                    break;
            }
        
            
            System.out.println();
        }

        sc.close();
    }
}