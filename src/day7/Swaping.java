package day7;
import java.util.Arrays;


public class Swaping {





    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
public static void solution(int[] arr,int k){
    int size=arr.length;
    k=k%size;

    reverse(arr, 0, k-1);
    reverse(arr,  k,size-1);
    reverse(arr, 0, size-1);

}

    public static void main(String[] args) {
        int[ ] arr={5 ,3 ,2 ,1, 8};
        int k=2;
        solution(arr,k);

        System.out.println(Arrays.toString(arr));
        
    }
    
}   
    

