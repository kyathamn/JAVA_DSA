package day2;
import java.util.Scanner;


public class EvenOdd {
    

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a value:");
        a=sc.nextInt();
        System.out.println(a);
        if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("not even");
        }
        
    }
}

