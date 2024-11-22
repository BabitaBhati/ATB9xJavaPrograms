package OOps.Map_Collection2224;

import java.util.HashMap;
import java.util.Map;

public class Lab219_Map_P4 {
    public static void main(String[] args) {
        Map<String,Object> m=new HashMap<>();
        m.put("A",1);
        m.put("E",2);
        m.put("P",3);
        System.out.println(m);

        for (Map.Entry<String,Object> item:m.entrySet()){
            System.out.println(item.getKey()+"-->"+item.getValue());
        }
    }
}
