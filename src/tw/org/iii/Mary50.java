package tw.org.iii;

import java.util.HashMap;

public class Mary50 {
    public static void main(String[] args){
        HashMap<String,Object> map = new HashMap<>();//(key, value)
        map.put("name", "Mary"); //(key, value)
        map.put("gender", false);
        map.put("weight", 60);
        System.out.println(map.get("name"));
        System.out.println(map.get("gender"));
        System.out.println(map.get("weight"));
    }
}
