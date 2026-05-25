package day2;
    import java.util.Scanner;
public class Amstrong {
    

    public static void main(String[] args){
        int n,rem,m,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");

        n=sc.nextInt();
        m=n;
        sum=0;
         
         while(n>0){
            
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
         }
         System.out.println("amstrong number:"+sum);
    }
}

