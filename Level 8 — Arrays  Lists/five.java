// reverse the elements of an array.

public class five {
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int i = 0, j = n -1;
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
       /* int n = arr.length;
       for(int i= 0; i<arr.length/2; i++){
        int temp = arr[i];
        arr[i] = arr[n - 1-i];
        arr[n - 1-i] = temp;
       }
       for(int x : arr){
        System.out.print(x + " ");
       }*/
    }
}
// while loop is good for swapping and reverse
