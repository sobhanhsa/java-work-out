import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        // fix priority
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        if (c > d) {
            int t = c;
            c = d;
            d = t;
        }

        boolean abContainsC = isBetween(a, b, c, n);
        boolean abContainsD = isBetween(a, b, d, n);

        boolean cdContainsA = isBetween(c, d, a, n);
        boolean cdContainsB = isBetween(c, d, b, n);

        // intersection condition for chords on circle
        boolean intersect = (abContainsC ^ abContainsD) && (cdContainsA ^ cdContainsB);

        if (intersect) {
            System.out.println(4);
        } else {
            System.out.println(3);
        }
    }

    static boolean isBetween(int a, int b, int x, int n) {
        return a < x && x < b;
    }
}