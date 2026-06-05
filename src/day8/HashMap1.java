package day8;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Ravi",89);
        map.put("raj",76);
        map.put("siri",66);
        map.put("tarun",99);
        //System.out.println(map);
        //for(String c: map.keySet()){
         //   System.out.println(c+":"+map.get(c));
        //}
        for(String c: map.keySet()){
            if(map.get(c)==99){
                System.out.println(c);
            }
        }
    }
    
}
