// sum of natural number

import java.util.Scanner;

public class seventh {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number");
        int n = sc.nextInt();
        int sum = 0;

        for ( int i = 1; i <= n; i++){
            
            sum += i;
        }
        System.out.println(sum);
        
        sc.close();
    }
}
