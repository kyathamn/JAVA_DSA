package day7;

public class TryCatch2 {
    public static void main(String[] args){
        try {
            String s=null;
            String s1="nikki";
            if(s.equals(s1)){
                System.out.println("Equal");
            }
            System.out.println(9/0);
            
        }catch(NullPointerException e){
            System.out.println("Nul");
            
        }
        
        
    }

    
}
