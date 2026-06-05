package day8;
import java.util.*;

public class SortArray {
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();// t number of test cases
        for(int j=0;j<t;j++){
        int ArrListSize=sc.nextInt();//size of arrayList
        ArrayList<Integer> arr=new ArrayList<>();//Aray List declaration
        for(int i=0;i<ArrListSize;i++){//adding values into array list
            int m=sc.nextInt();
            
            arr.add(m);
        }
        //System.out.println(arr);
        
        Collections.sort(arr);
        System.out.println(arr);//printing max value
    }
    
}
}

