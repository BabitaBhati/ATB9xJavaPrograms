package OOps.Map_Collection2224;

import java.util.HashMap;
import java.util.Map;

public class Lab218_Map_P2 {
    public static void main(String[] args) {


        Map<String, Integer> m = new HashMap<>();
        m.put("E",1);
        m.put("S",2);
        m.put("S",2);//duplicate values not allowed and not through any error just print 1 value
        m.put("W",4);
        m.put("O",4);
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.size());
        System.out.println(m.containsKey("E"));
        System.out.println(m.containsValue(3));


    }
}
