package day7;
import java.util.Scanner;


public class CheckNumber {




     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0 ; i<n ; i++) {
            String s=sc.nextLine();
            boolean found=false;     

            for(int j=0;j<s.length() ; j++){
                char ch=s.charAt(j);
                if(ch>='0' && ch<='9'){
                    found=true;
                    break;
                }
            }
            System.out.println(found);
        }


     }
}
    

