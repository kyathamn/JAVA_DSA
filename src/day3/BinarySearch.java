package day3;

import java.util.Arrays;

public class BinarySearch {
public static boolean solution(int[]  arr,int key){
    //sorted array TC:0(Nlogn)
    Arrays.sort(arr);

    //finding the mid compareing with the search  key
    int start=0;
    int end=arr.length-1;
    while (start<end) { 
        int mid = start+(end-start)/2;

        if(key<arr[mid]){
            start = mid;

        }else if(key>arr[mid]){
            start =mid+1;
        }else {
            return true;
        }

        
    }
    return false;


}

    public static void main(String[] args) {
        int[] arr={-1,2,3,4,5,6,10};

        if(solution(arr,5)){
            System.out.println("element is perfect");

        }else{
            System.out.println("element is not perfect");
        }
    }
    
}
