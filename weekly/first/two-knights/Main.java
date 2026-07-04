import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        sc.close();

        

        for ( int i = 1; i <= k; i++) {
            double total =( Math.pow(i, 2) * (Math.pow(i,2) - 1))/2;
            double attacking = 4 * (i - 1) * (i - 2);

            System.out.println((int)(total - attacking));
        }
    }
}