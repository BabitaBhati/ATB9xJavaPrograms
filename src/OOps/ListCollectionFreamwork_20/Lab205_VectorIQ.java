package OOps.ListCollectionFreamwork_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab205_VectorIQ {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add(99);
        list.add(80);
        list.add(22);
        list.add(33);
        list.add(22);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
