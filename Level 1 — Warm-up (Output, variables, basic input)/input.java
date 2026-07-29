import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("first number: ");
        int a = sc.nextInt();

        System.out.println("Second number: ");
        int b = sc.nextInt();

        int addition = a+b;

        System.out.printf("sum =" +  addition);
        sc.close();

        
        
    }
}
