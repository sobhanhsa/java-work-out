import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0;
        char op;

        do {

            if (sc.hasNextDouble()) {
                num1 = sc.nextDouble();
            } else {
                op = sc.next().charAt(0);
                if (op == 'q') {
                    System.out.println("Program terminated");
                    break;
                } else {
                    continue;
                }
            }

            num2 = sc.nextDouble();
            op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println((int) result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println((int) result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println((int) result);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println((int) result);
                    }
                    break;
            }

        } while (true);

        sc.close();
    }
}