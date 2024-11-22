package OOps.Generic_Why_Collection;

import java.util.ArrayList;

public class Lab199_ArrayList {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Ram");
        ar.add("Sita");
        ar.add("Radhe");
        ar.add("Radhe");//dupliacte data is allowed
        ar.add(true);//different data type is allowed
        System.out.println(ar);
    }
}
