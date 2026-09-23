//program to find the largest and smallest element in an arra

public class second {
    public static void main(String args[]) {
        int[] arr = { 5, 2, 3, 4,234 };
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }else if(arr[i]< min){
                min =arr[i];
            }

        }
        System.out.println("max ele is:"+max);
        System.out.print("min ele is:"+min);

    }

}
