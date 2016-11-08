package tw.org.iii;

import java.net.InetAddress;
import java.net.Socket;
//TCP - Sender
public class Mary42 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getByName(""), 9999);
            socket.close();
            System.out.println("OK");
        } catch (Exception ee) {
        }
    }
}
