package tw.org.iii;

public class Mary35 {
    public static void main(String[] args){
    Mary353 obj1 = new Mary353();
    Mary353 obj2 = new Mary353();
    }
}
class Mary351{
    static {System.out.println("Mary351:static{...}");}
    {System.out.println("Mary351:{...}");}
    Mary351(){System.out.println("Mary351()");}
    void m1(){System.out.println("Mary351:m1()");}
    static void m2(){System.out.println("Mary351():m2");}
}
class Mary352 extends Mary351{
    static {System.out.println("Mary352:static{...}");}
    {System.out.println("Mary352:{...}");}
    Mary352(){System.out.println("Mary352()");}
    void m1(){System.out.println("Mary352:m1()");}
    static void m2(){System.out.println("Mary352():m2");}
}
class Mary353 extends Mary352{
    static {System.out.println("Mary353:static{...}");}
    {System.out.println("Mary353:{...}");}
    Mary353(){System.out.println("Mary353()");}
    void m1(){System.out.println("Mary353:m1()");}
    static void m2(){System.out.println("Mary353():m2");}
}