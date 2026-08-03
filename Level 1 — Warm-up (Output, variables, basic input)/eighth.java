// avearage calculator

import java.util.Scanner;
public class eighth{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("entr number of subs:");

        int subs = sc.nextInt();


        System.out.println("enter first  sub marks:");
        int a = sc.nextInt();

        System.out.println("enter first  sub marks:");
        int b = sc.nextInt();

        System.out.println("enter first  sub marks:");
        int c = sc.nextInt();

        System.out.println("enter first  sub marks:");
        int d = sc.nextInt();

        float average = (a + b + c + d) / subs;


        System.out.printf("avearage of  total {subs} subjects = " + average);
       

        sc.close();

    }
}
