import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter operator:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int n = sc.nextInt();

        if (n == 1) {

            System.out.println("Addition of two numbers is: " + (a + b));

        } else if (n == 2) {

            System.out.println("Subtraction of two numbers is: " + (a - b));

        } else if (n == 3) {

            System.out.println("Multiplication of two numbers is: " + (a * b));

        } else if (n == 4) {

            if (b == 0) {
                System.out.println("Division by zero is not possible");
            } else {
                System.out.println("Division of two numbers is: " + (a / b));
            }

        } else {

            System.out.println("Invalid operator");

        }

        sc.close();
    }
}