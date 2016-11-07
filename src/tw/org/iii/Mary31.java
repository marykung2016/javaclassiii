package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Mary31 {
    public static void main(String[] args){
        try{
            FileInputStream fin =
                    new FileInputStream("dir1/file1");
            int b;
            while ((b = fin.read()) != -1){
                System.out.print((char)b);
            }
            fin.close();
        }catch (FileNotFoundException fe) {

        }catch (IOException fe){

        }

    }
}
