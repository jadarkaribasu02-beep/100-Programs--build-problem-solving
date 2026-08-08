public class first{
    public static void main(String[] args){
        int n = 5;

        // outer loop runs or iterated over the all rows

        for (int i = 1; i <= 5; i ++){
            //inner loop iterate over all coloumns

            for (int j = 1; j<= 5; j ++){
                System.out.print("*");
            }

            // move to next row 
            System.out.println();


        }
    }
}