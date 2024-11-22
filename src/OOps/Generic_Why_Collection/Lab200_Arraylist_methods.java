package OOps.Generic_Why_Collection;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class Lab200_Arraylist_methods {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Ram");
        list.add("Ram");
        list.add("Sita");
        list.add("Radhe");
        list.add("Radhe");//dupliacte data is allowed
        list.add(true);//different data type is allowed

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.iterator());
        System.out.println(list.remove("Ram"));
        System.out.println(list.indexOf("Radha"));

    }
}
