package day5;

public class Append {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("vivek").append("trainer").reverse().insert(2,"xyz").delete(3,7);
        System.out.println(sb);
    }
    
}
