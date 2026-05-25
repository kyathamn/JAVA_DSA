package day7;

public class Eligible {
    public static void main(String[] args) {
        int n=200;
        try {
            if(n>18){
                throw new ArithmeticException("not > 18");
            }
            System.out.println("not eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
        

    
        }
    
}
