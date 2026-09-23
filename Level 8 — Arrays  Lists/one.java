
//program to find the sum and average of all elements in an array.
public class one {
    public static void main(String args[]){
        int [] arr = {10,10,10};
        int n = arr.length;
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            sum = sum +arr[i];
        }
        System.out.println("sum of the array:"+sum);
        System.out.println("average:"+sum/n);
        
    }
}
