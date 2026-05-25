package day3;
import java.util.Arrays;

public class LeftRotationByOne {

    public static void solution(int[] arr){
        int size=arr.length;

        //preserve the k values k=1
        int temp=arr[0];
        //move all the elemnet to i-1th position
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
             
        }
        arr[size-1]=temp;
    }
    public static void main(String[] args) {
        int[ ] arr={1,3,2,4,6,7,9};
        solution(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
