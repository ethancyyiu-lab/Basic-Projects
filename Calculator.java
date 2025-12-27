import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First number:");
        double num1 = input.nextDouble();

        System.out.println("Enter operator: ");
        String op = input.next();

        System.out.println("Second number:");
        double num2 = input.nextDouble();

        double result = 0;

        if (op.equals("+")) {
            result = num1 + num2;
        }
        else if (op.equals ("*")) {
            result = num1 * num2;
        }
        else if (op.equals ("-")) {
            result = num1 - num2;
        }
        else {
            result = num1 / num2;
        }
        System.out.println("Equals to: " + result);
    }
}
