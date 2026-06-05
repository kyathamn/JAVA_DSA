package day8;
import java.util.HashSet;


public class Iterator {
    public static void main(String[] args){
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        Iterator s= s1.iterator();
        while(s.hasNext()){
            System.out.println(s.next());
        }

    }
    
}
