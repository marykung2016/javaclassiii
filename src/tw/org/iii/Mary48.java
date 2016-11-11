package tw.org.iii;

import java.io.File;
import java.io.IOException;

public class Mary48 {
    public static void main(String[] args){
        try {
            MultipartUtility mu =
                    new MultipartUtility("http://10.2.24.117/Mary02.php","utf-8");
            mu.addFilePart("upload", new File("upload/android.jpg"));
            mu.finish();
            System.out.println("Upload OK");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
