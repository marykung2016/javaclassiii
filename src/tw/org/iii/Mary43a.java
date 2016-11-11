package tw.org.iii;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TCP -- Receiver //server
public class Mary43a {
    public static void main(String [] args){
        try {
            ServerSocket server =
                    new ServerSocket(9999);
            System.out.println("Listening...");
            Socket socket = server.accept();

            String urip = socket.getInetAddress().getHostAddress();
            System.out.println(urip + ":");

            FileOutputStream fout = new FileOutputStream("upload/" + urip + ".jpg");//此檔名字型定義,因讀不到原始檔名
            InputStream in = socket.getInputStream();  //3號動作.從網路得到串流進來
            int b;
            while ((b = in.read()) != -1){
            fout.write(b);
            }
            in.close();
            fout.flush();
            fout.close();

            server.close();
            System.out.println("Server OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
