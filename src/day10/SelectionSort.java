package day10;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //t no.of test cases
        int t=sc.nextInt();
        for(int k=0; k<t;k++){
            int n=sc.nextInt();
            int[] arr= new int[n];

            //to input array values
            for(int i=0 ; i<n; i++){
                arr[i] = sc.nextInt();
            }
            //to sort
            for(int i=0 ; i<n-1 ; i++){
                int min=i;
                for(int j=i+1; j< n ; j++){
                    if(arr[min]>arr[j]){
                        min=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
                System.out.println(Arrays.toString(arr));

            }
                System.out.println(Arrays.toString(arr));
            

        }
        
    }
}
    

