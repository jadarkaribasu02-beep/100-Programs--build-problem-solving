//Write a program to find the sum of all even and odd numbers from 1 to n.

import java.util.Scanner;

public class fifth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number:");
        int n = sc.nextInt();
        int sum = 0;
        int odd = 0;

        for (int i = 1; i <=n; i++){
            if(i % 2 == 0){
                sum +=i;
            }else {
                odd +=i;
            }
        }
        System.out.println(sum);
        System.out.println(odd);
        sc.close();
    }
   
    
}
