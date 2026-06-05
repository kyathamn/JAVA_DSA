package day10;
import java.util.Arrays;
import java.util.Scanner;

public class BinearySearch {





    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //t no.of test cases
        int t=sc.nextInt();
        for(int k=0; k<t;k++){
            int n=sc.nextInt();
            int[] arr= new int[n];
            int tar = sc.nextInt(); //declare target

            //to input array values
            for(int i=0 ; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            System.out.println(Arrays.toString(arr));
            // int idx=0;
            int l=0;
            int r=n-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(arr[mid]==tar){
                    System.out.println("Element found : "+mid);
                    break;

                }else if(arr[mid]<tar){
                    l++;
                    
                }else{
                    r--;
                }
        }

        sc.close();
        
    }
    }

}
    

