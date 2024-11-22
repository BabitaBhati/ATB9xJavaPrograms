package OOps.Map_Collection2224;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab220_Map_P4 {
    public static void main(String[] args) {

        //store hashmap values in list
        HashMap<String,Object> h=new HashMap<>();
        h.put("Student","Ram");
        h.put("Rollno","10");
        System.out.println(h);

        HashMap<String,Object> h1 =new HashMap<>();
        h1.put("Student1","Sita");
        h1.put("Rollno1","20");
        System.out.println(h1);

        //we can store the map values into the list in proper way
        List list=new ArrayList();
        list.add(h);
        list.add(h1);
        System.out.println(list);
    }
}
