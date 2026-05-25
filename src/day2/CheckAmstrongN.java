package day2;

import java.util.Scanner;

public class CheckAmstrongN {

    public static boolean solution(int num){
        //step1:get th count of digits
        int temp=num;
        int count=0;

        while(temp!=0  ) { 
            count++;
            temp=temp/10;
            
        }
        //step 2: cal the consicutive sum of all digits with its
        temp =num;
        double result=0;
        while(temp!=0  ) { 
            int digit=temp%10;
            result=result+Math.pow(digit,count);
            temp/=10;
            
        

    }

    System.out.println(result+" "+num);

    return result==num;

    
    
}
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();

         if(solution(num)){
            System.out.println("this is amstrong");

         }else{
            System.out.println("not amstrong number");
         }
      
  }
}


