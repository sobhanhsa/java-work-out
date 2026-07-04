import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int lenght = sc.nextInt();

        int[] arr = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        sc.close();

        int left = 0;
        int right = lenght - 1;

        while (left <= right) {
            
            int mid = (left + right) / 2;

            // System.out.println("Left: " + left + " Right: " + right + " Mid: " + mid);

            if (arr[mid] > target)
                right--;
            else if (arr[mid] < target)
                left++;
            else {
                System.out.println(mid);
                return;
            }

            
        }

        System.out.println(-1);
        return;
    }
}