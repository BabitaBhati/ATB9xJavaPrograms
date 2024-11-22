package OOps.List_Set_Collections2124;

import java.util.HashSet;
import java.util.Set;

public class Lab212_Set {
    public static void main(String[] args) {
        //set does not allow duplicate values

        Set s=new HashSet();

        s.add("Radha");
        s.add("Radha");
        s.add("Shyam");
        s.add("Nikunj");

        System.out.println(s);

    }
}
