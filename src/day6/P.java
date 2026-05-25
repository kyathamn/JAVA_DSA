package day6;

public class P {
    public void m1(){
        System.out.println("m1");
    }
    
}
class C extends P{
    public void m2(){
        System.out.println("m2");
    }
}
class Test{
    public static void main(String[] args) {
        //case 1:
        C c1=new C();
        c1.m1();
        c1.m2();

        //case2:
        P p=new P();
        p.m1();//valid p1 is a parent
        //p.m2();//in valid case 2 cannot access parent(compile time error)

        //case3:
        P p1=new C();
        p1.m1();//valid we can only access parent object
        //p1.m2();//invalid we canot access child object (complie time error)

        //case4:
       // C c1=new p(); //compile time error

    }
}
