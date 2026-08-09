// Write a program to display all even numbers from 1 to n.
import java.util.Scanner;

public class third {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int k = sc.nextInt();

        int even = 2;

        while( even <= k){
            
            System.out.println(even);
            even = even +2;
        }


       
        sc.close();
    }
    
}
