import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Use a HashSet to find the total number of distinct elements in the array
        HashSet<Integer> distinct = new HashSet<>();

        // Read the array elements and populate the HashSet
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            distinct.add(arr[i]);
        }

        int totalDistinct = distinct.size();

        // Use a HashMap to keep track of the frequency of elements in the current window (distinct-item,frequency)
        HashMap<Integer, Integer> freq = new HashMap<>();

        int left = 0;
        int countDistinct = 0;
        int answer = n;

        for (int right = 0; right < n; right++) {
            int x = arr[right];

            // Update the frequency of the current element in the HashMap
            freq.put(x, freq.getOrDefault(x, 0) + 1);

            // the second time we see a distinct element, freq is more than 1
            if (freq.get(x) == 1)
                countDistinct++;

            while (countDistinct == totalDistinct) {
                answer = Math.min(answer, right - left + 1);

                // if we enter while we count all distinct elements
                int y = arr[left];
                freq.put(y, freq.get(y) - 1);

                if (freq.get(y) == 0)
                    countDistinct--;
                
                System.out.println(countDistinct);

                left++;
            }
        }

        sc.close();

        System.out.println(answer);
    }
}