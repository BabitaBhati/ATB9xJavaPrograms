package OOps.List_Set_Collections2124;

import java.util.HashSet;

public class Lab214_HS {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();

        hs.add("A");
        hs.add("SS");
        hs.add("M");
        hs.add(null);//hashset allowed null values
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("A"));

    }
}
