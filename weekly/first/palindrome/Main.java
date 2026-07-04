import java.util.Scanner;

public class Main {

    private static boolean isEvenPalindrome(String input) {
        int lenght = input.length();


        for (int i = 0; i < lenght/2; i++) {
            if (input.charAt(i) != input.charAt(lenght -1 -i)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int lenght = input.length();

        for (int i = 0; i < lenght; i++) {
            String newString = input.substring(0, i) + input.substring(i + 1);

            boolean isPalindrome = isEvenPalindrome(newString);

            if (isPalindrome) {
                System.out.println(true);
                sc.close();
                return;
            }
        }

        System.out.println(false);
        sc.close();


    }
}
