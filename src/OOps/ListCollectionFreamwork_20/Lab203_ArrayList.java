package OOps.ListCollectionFreamwork_20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("TTT");
        list.add("hhhh");
        list.add("LL");
        list.add("RR");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf("LL"));
        //System.out.println(list.size());

        System.out.println("Loop.............");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            //System.out.println(i);
        }
        System.out.println("..for each loop");
        for(Object o:list){
            System.out.println(o);
        }
        System.out.println("For iterator");

        Iterator it= list.iterator();//go one by one access
        while(it.hasNext()){//if we have next element then true
            System.out.println(it.next());//next element
        }
    }
}
