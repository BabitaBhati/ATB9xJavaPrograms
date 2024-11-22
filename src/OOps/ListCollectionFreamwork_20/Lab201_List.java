package OOps.ListCollectionFreamwork_20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab201_List {
    public static void main(String[] args) {
        List list=new ArrayList();//Arraylistformat
        List list1=new LinkedList();//Doubly linked list
        List fruits=List.of("Apple","Orange");
        fruits.add("Guhava");//UnsupportedOperationException

    }
}
