package tw.org.iii;
//Exception : 例外 / 異常
public class Mary28 {
    public static void main(String[] args){
        int a = 10, b = 0;
        int [] d = {0,1,2,3};
        try {                   //2.處理exception,程式正常結束
            int c = a / b;      //1. 出現runtime exception, JVM丟出的紅單
        }catch (ArithmeticException ae){

        }
        System.out.println(d[4]);
        System.out.println("Game Over");
    }
}