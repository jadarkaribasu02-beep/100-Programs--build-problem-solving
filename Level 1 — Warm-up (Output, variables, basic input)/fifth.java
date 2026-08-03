import java.util.Scanner;

public class fifth {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter first number:");
        int b = sc.nextInt();

        System.out.println("before swapping:" + a + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping:"+ a + b);

        sc.close();


    }
}
