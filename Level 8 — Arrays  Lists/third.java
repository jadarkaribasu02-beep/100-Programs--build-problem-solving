//program to count the number of even and odd elements in an array.

public class third {
    public static void main(String []args){
        int []arr = {1,2,3,4,5,7,100};
        int n =arr.length;
        int even=0,odd=0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even:"+even);
        System.out.print("odd:"+odd);

    }
}
