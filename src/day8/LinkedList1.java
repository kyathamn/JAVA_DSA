package day8;
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args){
    LinkedList<Integer> ll=new LinkedList<>();
    ll.add(90);
    System.out.println(ll);
    ll.addFirst(89);
    System.out.println(ll);
    ll.addLast(76);
    System.out.println(ll);
    ll.offer(60);
    System.out.println(ll);
    ll.offerFirst(24);
    System.out.println(ll);
    ll.offerLast(22);
    System.out.println(ll);
    ll.get(3);
    System.out.println(ll);
    ll.getFirst();
    System.out.println(ll);
    ll.getLast();
    System.out.println(ll);
    ll.peek();
    System.out.println(ll);



    
}
}
