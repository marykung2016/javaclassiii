package tw.org.iii;

public class Mary13 {
    public static void main(String[] args){
        int[]a;
        a = new int[3];
        //for (int i=0; i<a.length; i++){
            //System.out.println(a[i]);
        //}
        for (int v: a){ // = foreach
            System.out.println(v);
        }
    }
}
//陣列在Java語法特性: 1.型別固定, 2.長度初始化後即固定
