package day8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

    

public class EmployeeDupli {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0; i<t ; i++){

            int n=sc.nextInt();
            ArrayList<String> emd = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                String val=sc.nextLine();
                emd.add(val);    
            }
            LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
            System.out.println(lhs);
        }
    } 
}
    

