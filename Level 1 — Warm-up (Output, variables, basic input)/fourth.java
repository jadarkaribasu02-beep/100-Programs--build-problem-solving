import java.util.Scanner;
public class fourth {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("enter radius of:");
       double radius = sc.nextDouble();

       double area = 3.14* radius* radius;
       double circuf= 2 * 3.14* radius;

       System.out.println("area of circle = " + area);

       System.out.println("circumference of circle = " + circuf);



    }
}
