package day7;

public class ArthmeticException {
    public static void main(String[] args) {
        int n=200;
        try {
            if(n>35){
                throw new ArithmeticException("not >35");
            }
            System.out.println("<35");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    
        }
}
