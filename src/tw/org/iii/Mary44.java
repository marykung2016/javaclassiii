package tw.org.iii;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//TCP - Sender // client
public class Mary44 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            File source = new File("dir1/Penguins.jpg");
            byte[] buf = new byte[(int)source.length()];
            FileInputStream fin = new FileInputStream(source);
            fin.read(buf);
            fin.close();


            Socket socket = new Socket(InetAddress.getByName("10.2.24.117"), 9999);
            OutputStream out = socket.getOutputStream();

            out.write(buf);
            out.flush();
            out.close();

            socket.close();
            System.out.println("OK----");
            System.out.println(System.currentTimeMillis() -start);

        } catch (Exception ee) {
            System.out.println("Client Exception: " + ee.toString());
        }
    }
}
