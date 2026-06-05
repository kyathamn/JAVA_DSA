package day8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<String> emd=new ArrayList<>();
        emd.add("raj");
        emd.add("nikki");
        emd.add("nikki");
        LinkedHashSet<String>lhs=new LinkedHashSet<>(emd);
        System.out.println(lhs);
    }
    
}
