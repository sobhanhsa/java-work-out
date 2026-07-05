import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        SmartDevice[] devices = new SmartDevice[n];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("L")) {
                String name = sc.next();
                double base = sc.nextDouble();
                int brightness = sc.nextInt();
                int status = sc.nextInt();

                devices[i] = new Light(name, base, brightness, status == 1);

            } else if (type.equals("T")) {
                String name = sc.next();
                double base = sc.nextDouble();
                int temp = sc.nextInt();
                int status = sc.nextInt();

                devices[i] = new Thermostat(name, base, temp, status == 1);

            } else if (type.equals("C")) {
                String name = sc.next();
                double base = sc.nextDouble();
                String quality = sc.next();
                int status = sc.nextInt();

                devices[i] = new Camera(name, base, quality, status == 1);
            }
        }

        sc.close();

        for (SmartDevice d : devices) {
            // its better to use a setter method and make isOn protected
            if (!d.isOn) d.isOn = true;

            sum += d.calculatePowerConsumption();

            d.printInfo();
            d.showSpecificFeature();
            System.out.println();
        }

        System.out.printf("Average Power: %.2f\n", sum / n);
    }
}