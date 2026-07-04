import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        sc.close();

        long total = n * (n + 1) / 2;
        long sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextLong();
        }

        sc.close();

        System.out.println(total - sum);
    }
}