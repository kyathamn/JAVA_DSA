package day4.Assignments;
import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print("Reverse is:");
        int size=s.length();
        for (int i = size-1; i>=0; i--) {
            char c=s.charAt(i);
            System.out.print(c);
            
        }
    }
    
}
