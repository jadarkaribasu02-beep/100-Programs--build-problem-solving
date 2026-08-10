
//Write a program to display all multiples of a number m up to n terms.
import java.util.Scanner;



public class nine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter the number (m): ");
        int m = sc.nextInt();

        System.out.print("Enter how many terms (n): ");
        int n = sc.nextInt();

        System.out.println("Multiples of " + m + " up to " + n + " terms:");

        // Loop to generate multiples
        for (int i = 1; i <= n; i++) {
            System.out.println(m * i);
        }
    }
}

