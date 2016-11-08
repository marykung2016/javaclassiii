package tw.org.iii;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ｍary39 {
    public static void main(String[] args){
        try {
            InetAddress ip = InetAddress.getByName("www.microsoft.com");
            System.out.println(ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("unknown host");
        }
    }
}
