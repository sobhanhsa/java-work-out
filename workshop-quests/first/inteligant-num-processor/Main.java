import java.util.Scanner;

public class Main {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int digitSum(int n) {
        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double x = sc.nextDouble();

            int num = (int) x; // Casting

            if (num < 0)
                continue;

            if (num == 0) {
                System.out.println("Zero detected");
                continue;
            }

            if (isPrime(num)) {
                System.out.println("Prime");
                continue;
            }

            switch (num % 2 == 0 ? 0 : 1) {

                case 0:
                    System.out.println(digitSum(num));
                    break;

                case 1:
                    System.out.println(factorial(num));
                    break;
            }
        }

        sc.close();
    }
}