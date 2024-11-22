package OOps.List_Set_Collections2124;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab209_Arraylist_Iterate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Raja");
        list.add("Ram");
        list.add("Sita");
        list.add("Radha");
        list.add("Krishna");
        System.out.println(list);
        System.out.println(".........");
        //Iterate the Arraylist
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println(".........");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(".........");
        //using Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}

