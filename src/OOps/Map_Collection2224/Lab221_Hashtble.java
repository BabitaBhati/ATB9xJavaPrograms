package OOps.Map_Collection2224;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab221_Hashtble {
    public static void main(String[] args) {
        //hashtable is sychronized table and slow

        Hashtable<String,Object> ht=new Hashtable<>();
        ht.put("R","1");
        ht.put("P","2");
        ht.put("P","3");//print updated values
        //ht.put(null,null);null not allowed
        System.out.println(ht);

        System.out.println("-------");
        HashMap<String,Object> hm=new HashMap<>();
        hm.put("U","0");
        hm.put("K","9");
        hm.put(null,null);
        System.out.println(hm);
        System.out.println("----------");
        Enumeration<String> e  = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }

    }
}
