package day8;
import java.util.HashMap;

public class LetterCount {
    public static void main(String[] args){
        String s="Programming";
        //char c[]=s.toCharArray();
        //System.out.println(c.toString());
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray()){
           // System.out.println(c);
            if(map.containsKey(c))
                {
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);


    }
    
}
