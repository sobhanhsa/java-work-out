import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int max = 0;

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            
            if ((i != input.length() - 1) && (input.charAt(i) == input.charAt(i + 1))) {
                count++;
            } else {
                count = 1;
            }

            if(count > max) {
                max = count;
            }

            

        }

        System.out.println(max);

        sc.close();
    }
}
