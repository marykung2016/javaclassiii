package tw.org.iii;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Mary47 {
    public static void main(String[] args){
                try {
                    URL url = new URL("http://10.2.24.117/Mary02.php?x=123&y=789");
                    HttpURLConnection conn =
                            (HttpURLConnection) url.openConnection();
                    conn.connect();

                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(conn.getInputStream()));
                    String line = br.readLine();
                    br.close();

                    System.out.println("Finish");

                }catch(Exception e){

                }
            }
        }
