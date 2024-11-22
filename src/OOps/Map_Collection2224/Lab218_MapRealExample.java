package OOps.Map_Collection2224;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab218_MapRealExample {
    public static void main(String[] args) {

        Map<String,Object> m=new HashMap<>();
        m.put("Name","DEEP");
        m.put("RollNo","12");
        m.put("Address","Delhi");
        System.out.println(m);

        Set s=new HashSet();
        s.add("Book");
        s.add("Habbit");
        s.add("Life");
        s.add("Way");
        System.out.println(s);
    }
}
