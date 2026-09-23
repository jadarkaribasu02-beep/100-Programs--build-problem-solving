//Write a program to remove duplicate elements from an array.

public class eight {
    public static void main(String args[]){
        int [] arr = {0,0,1,0,1,2,9};
        int n =arr.length;
        int nk = 0;
        int ns = 0;
        for(int i = 0; i<n; i++){
            if(i==0){
                ns++;
            }else{
                nk++;
            }
        }
        System.out.print(ns+nk);

     
        
    }
}
