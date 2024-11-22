package OOps.List_Set_Collections2124;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab213_Set_LT_TS {
    public static void main(String[] args) {
        Set s=new HashSet();

        s.add("Radha");
        s.add("Radha");
        s.add("Shyam");
        s.add("Nikunj");
        s.add(null);//Hashset allow null values
        System.out.println(s);
        System.out.println(s.contains("Radha"));
        System.out.println(s.remove("Nikunj"));
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s);


        Set s1=new LinkedHashSet();
        s1.add("HH");
        s1.add("KK");
        s1.add("LL");
        s1.add("MM");
        s1.add(null);//null value is allowed in Linkedhashset
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());


        Set s2=new TreeSet();

        s2.add("OO");
        s2.add("II");
        s2.add("PP");
        s2.add("MM");
        //s2.add(null);//NullPointerException bez Treeset not allowed null values
        System.out.println(s2);
        System.out.println(s2.size());
        System.out.println(s2.remove("MM"));
        System.out.println(s2.isEmpty());


        System.out.println("......");
        for (Object o:s2){
            System.out.println(o);
        }

    }
}
