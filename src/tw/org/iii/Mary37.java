package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Mary37 {
    public static void main(String[] args) {
        try {
            ObjectInputStream oin =
                    new ObjectInputStream(new FileInputStream("dir1/mary.oo"));
            Object obj = oin.readObject();
            Student s2 = (Student) obj;
            System.out.println(s2.name + ":" + s2.calcScore() + ":" + s2.calcAvg());
            oin.close();
        } catch (ClassNotFoundException e) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

