package day8;
import java.util.LinkedList;
import java.util.TreeSet;

public class HashSet2 {
    public static void main(String[] args){
        TreeSet<Integer> set=new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(7);
        set.add(89);
        System.out.println(set);
        LinkedList<Integer> s=new LinkedList<>(set);
        System.out.println(s);
    }
    
}
