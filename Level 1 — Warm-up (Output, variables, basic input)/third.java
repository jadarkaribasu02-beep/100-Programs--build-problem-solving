import java.util.Scanner;
public class third
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number:");
        double a = sc.nextDouble();

        System.out.print("enter first number:");
        double b = sc.nextDouble();

        System.out.print("sum ="+ a +b);
        System.out.print("sub =" + (a - b));
        System.out.print("product = " + a * b);

        if (b != 0){
            System.out.println("quotient=" + (a / b));
        }else{
            System.out.print("cannot didvide by zero");
        }
        sc.close();



    }

    
}
