// Write a program to display all odd numbers from 1 to n
import java.util.Scanner;


public class fourth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number:");
        int n = sc.nextInt();

        int odd = 1;

        while(odd <= n){
            System.out.println(odd);
            odd = odd +2;
        }
        sc.close();
    }
}
