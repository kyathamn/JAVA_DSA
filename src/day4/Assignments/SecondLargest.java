package day4.Assignments;

public class SecondLargest {

    public static int solution(int[] arr){

        int largest=Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                return secondLargest;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr={8,12,7,-1};

        System.out.println("secondLargest");
        
    }

    
}
