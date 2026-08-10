//Write a program to display the multiplication table of a number n.
import java.util.Scanner;

public class sixth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number");
        int n = sc.nextInt();

        System.out.println("enter terms");
        int t = sc.nextInt();

        for( int i= 1; i<= t; i++){
            System.out.println(n +"*"+ i+ "="+ n*i );
        }
        sc.close();
    }
    
}
