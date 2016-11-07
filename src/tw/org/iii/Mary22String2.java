package tw.org.iii;

public class Mary22String2 {
    public static void main(String[] args){
        String s1 = "Mary";
        String s2 = "Mary";
        String s3 = new String("Mary");
        String s4 = new String("Mary");
        System.out.println(s1 == s4); //比對是否同一個"物件"
        System.out.println(s3.equals(s4)); //比對字串的"內容"是否相同
        System.out.println("---");
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println("-----");
        String s5 = s3;
        System.out.println(s3.concat("III"));
        System.out.println(s3);
        System.out.println("---");
        System.out.println("p1");

    }

}
class Pen extends Object {
    @Override
    public String toString() {
        return "Apple";
    }

}