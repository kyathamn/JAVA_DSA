package day2;

public class MinMax {
    
    public static void main(String[] args) {
        
    int[] arr={2,3,4,5,6,7};
    
    int min=arr[0];
    int max=arr[0];

    for(int i=1;i<=5;i++){
        if(arr[i]<min){
            min=arr[i];

        }
        if (arr[i]>max) {
            max=arr[i];
            
        }

    System.out.println("min value is:"+min);
    System.out.println("max value is:"+max);
}
}
}


