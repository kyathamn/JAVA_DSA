package day4.Assignments;

public class Case1 {
    public static void main(String[] args) {
        
    

    String s1=new String("vivek");
    String s2=new String("vivek");
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));

    StringBuffer sb1=new StringBuffer("vivek");
    StringBuffer sb2=new StringBuffer("Vivek");

    System.out.println(sb1==sb2);//false
    System.out.println(sb1.equals(sb2));//false
    
    
}
}
