package tw.org.iii;

public class Mary25 {
    public static void main(String[] args){
        Mary251 obj1 = new Mary251();
        //obj2 = new Mary252(); //抽象類別無法直接建構出物件實體,期待/透過其子類別出現,建立實體
        Mary252 obj2 = new Mary253();
        Mary252 obj3 = new Mary254();
        obj2.m2();
        obj3.m2();
    }
}
class Mary251 {
    int a;
    void m1() {}
    void m2() {}
}
abstract class Mary252 {
    int a;
    void m1() {}
    abstract void m2();//抽象:有定義(方法),卻無實作 =>講的不清不楚,半成品,只說要這樣做,但卻沒有做出來
}
class Mary253 extends Mary252 { //產生其子類別
    void m2() {System.out.println("Mary253:m2(){}");} //把m2方法實作出來
}
class Mary254 extends Mary252 { //產生其子類別
    void m2() {System.out.println("Mary254:m2(){}");} //m2方法實作出來
}


