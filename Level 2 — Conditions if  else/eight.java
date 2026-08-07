// number divisible by both 3 and 5

import java.util.Scanner;

public class eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number you want to check");
        int a = sc.nextInt();{

        if (a % 3 == 0 && a % 5 == 0 ){
            System.out.println("Divisible by both 3 and 5");
        }else if(a % 5 == 0) {
            System.out.println("divisible by 5");
        }else if(a % 5 == 0) {
            System.out.println("divisible by 5");


        }else 
            System.out.println("wrong number");
        }


    }
    
}
