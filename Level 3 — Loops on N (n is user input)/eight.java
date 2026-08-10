import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int th = 0;   // count divisible by 3
        int fve = 0;  // count divisible by 5

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                th++;   // increment count
            }
            if (i % 5 == 0) {
                fve++;  // increment count
            }
        }

        System.out.println("Numbers divisible by 3: " + th);
        System.out.println("Numbers divisible by 5: " + fve);
    }
}