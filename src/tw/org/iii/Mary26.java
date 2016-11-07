package tw.org.iii;

public class Mary26 {
    public static void main(String[] args){

    }
}
abstract class Mary261 { //抽象類別有建構式
    void m1(){}
    abstract void m2();
}

interface Mary262 { //介面=規格,只能定義,而沒有任何實作 =>比抽象還要更抽象
    //int a; //介面沒有建構式,可以擁有屬性,沒有機會變更其值,所以在定義屬性時,便給其值
    //void m1(){} //規格,只能定義,而沒有任何實作
    int a = 1;
    void m2();
}

class Mary263 implements Mary262 {
    public void m2(){}     //規格裡的方法都是public,但必須是相同package才看得到
}