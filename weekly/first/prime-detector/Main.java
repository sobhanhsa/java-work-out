import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(scanner.nextInt());

        if (number == 1) {
            System.out.println("false");
            scanner.close();
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("false");
                scanner.close();
                return ;
            }
        }

        System.out.println("true");
        scanner.close();
    }
}