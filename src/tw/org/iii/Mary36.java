package tw.org.iii;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Mary36 {
    public static void main(String[] args){
        Student s1 = new Student("Mary",70,50,30);
        System.out.println(s1.name + ":" + s1.calcScore() + ":" + s1.calcAvg());

        try {
            ObjectOutputStream oout = new ObjectOutputStream(
                    new FileOutputStream("dir1/mary.oo"));
            oout.writeObject(s1);
            oout.flush();
            oout.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
    class Student implements Serializable {
        int ch;
        transient int math; //屬性加入transient,則不會被序列化
        int eng;
        String name;

        Student(String name, int ch, int math, int eng) {
            this.name = name;
            this.ch = ch;
            this.math = math;
            this.eng = eng;
        }

        int calcScore() {
            return ch + math + eng;
        }

        double calcAvg() {
            return calcScore() / 3.0;
        }
    }