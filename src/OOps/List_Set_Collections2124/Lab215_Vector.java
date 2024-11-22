package OOps.List_Set_Collections2124;

import java.util.Enumeration;
import java.util.Vector;

public class Lab215_Vector {
    public static void main(String[] args) {

        Vector<String> vs=new Vector<>();
        vs.add("W");
        vs.add("N");
        vs.add("e");
        vs.add(null);//allowed null values
        System.out.println(vs);
        System.out.println(vs.capacity());
        System.out.println("............");

        for (Object o:vs){
            System.out.println(o);
        }
        System.out.println(",,,,,,,,,,,,,,,,");

        Enumeration e=vs.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
