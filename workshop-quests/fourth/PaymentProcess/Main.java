import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();

        sc.close();

        PaymentGateway zarin = new ZarinPalGateway(amount);
        PaymentGateway mellat = new MellatGateway(amount);

        System.out.println("ZarinPal Fee for " + amount + " is: " + zarin.calculateFee());
        System.out.println("Mellat Fee for " + amount + " is: " + mellat.calculateFee());
    }
}