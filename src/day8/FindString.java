package day8;
import java.util.LinkedList;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        int n=sc.nextInt();
        
        
        LinkedList<String> ll=new LinkedList<>();
        for(int i=0;i<n;i++){
            String val = sc.nextLine();
            ll.add(val);
        }
       // System.out.println(ll);
            System.out.println(ll.contains(k));
        int c=0;
        for(String d:ll){
        if(d.equals(k)){
            c++;
        }
        }
        System.out.println(c);
    }
    
}
