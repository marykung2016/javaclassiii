package tw.org.iii;

import java.io.BufferedOutputStream;
import java.net.InetAddress;
import java.net.Socket;
//TCP - Sender // client
public class Mary42 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getByName("10.2.24.117"), 9999);
            
            BufferedOutputStream bout = new BufferedOutputStream(
                    socket.getOutputStream());
            bout.write("Hello, Mary,\nHello, World".getBytes());
            bout.flush();
            bout.close();
            
            socket.close();
            System.out.println("OK");
        } catch (Exception ee) {
        }
    }
}
