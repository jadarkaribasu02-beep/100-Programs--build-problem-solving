
//Check whether a number is Positive, Negative or Zero
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.print("positive");
        } else if (num < 0) {
            System.out.print("negative:");
        } else {
            System.out.print("zero");
        }

    }

}
