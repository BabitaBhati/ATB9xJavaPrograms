package OOps.ListCollectionFreamwork_20;

import java.util.Vector;

public class Lab202_Vector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("Ram");
        v.add("Krishna");
        v.add("Radha");
        System.out.println(v);
        v.capacity();
        v.isEmpty();
        v.remove("Ram");
        v.stream().toList();
        System.out.println(v.contains("Sita"));
        System.out.println(v);
    }
}
