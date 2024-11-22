package OOps.Map_Collection2224;

import java.util.HashMap;
import java.util.Map;

public class Lab217_Map {
    public static void main(String[] args) {
        //map store the value in key value format and doesnt store the null keys but value
        //can be duplicate

        Map<String,Object> m=new HashMap<>();
        m.put("B","H");
        m.put("K","P");
        m.put("R","K");
        System.out.println(m);

        System.out.println(m.keySet());
        //difference between List and map

    }
}
