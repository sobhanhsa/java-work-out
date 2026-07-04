import java.util.Scanner;

public class Main {

    public static int average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int countGreaterThanAverage(int[] arr, int avg) {
        int count = 0;
        for (int num : arr) {
            if (num > avg) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int avg = average(arr);

        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + minimum(arr));
        System.out.println("Maximum: " + maximum(arr));
        System.out.println("Count > Average: " + countGreaterThanAverage(arr, avg));
    }
}