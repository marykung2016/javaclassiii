package tw.org.iii;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mary33 {
    public static void main(String[] args){
        try {
            FileOutputStream fout = new FileOutputStream("dir1/file4", true);
            fout.write("哈囉, 龔美莉\n".getBytes());
            fout.flush();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
