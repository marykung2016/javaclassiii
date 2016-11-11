package tw.org.iii;

import java.util.LinkedList;
import java.util.TreeSet;

public class Mary49 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        while (set.size() < 6) {
            set.add((int) (Math.random() * 49 + 1));
            System.out.println(set.toString());
            System.out.println("------------");
            LinkedList list = new LinkedList();
            list.add(0,1);
            list.add(0,2);
            list.add(0,3); //置換位置 -- 只能換後面的位置,不能換前面的位置
            list.add(0,4);
            list.add(0,5);
            System.out.println(list.toString());
        }
    }
}