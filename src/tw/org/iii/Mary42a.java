package tw.org.iii;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//TCP - Sender // client
public class Mary42a {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            Socket socket = new Socket(InetAddress.getByName("10.2.24.117"), 9999);
            OutputStream out = socket.getOutputStream();
            FileInputStream fin = new FileInputStream(
                    "dir1/Penguins.jpg");
            int b;
            while ((b = fin.read()) != -1){ //不斷讀一個byte並往外送;讀一個丟一個
                    out.write(b);
            }
            fin.close();
            out.flush();
            out.close();
            socket.close();
            System.out.println("OK");
            System.out.println(System.currentTimeMillis() -start);

        } catch (Exception ee) {
            System.out.println("Client Exception: " + ee.toString());
        }
    }
}
