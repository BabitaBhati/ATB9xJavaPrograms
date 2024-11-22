package OOps.List_Set_Collections2124;

import java.util.ArrayList;
import java.util.List;

public class Lab211_Arraylist {
    public static void main(String[] args) {
        Student_ArrayList s1=new Student_ArrayList("Anil","10");
        Student_ArrayList s2=new Student_ArrayList("Radha","11");

        List<Student_ArrayList> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);

        s1.studentDetails();
        s2.studentDetails();

        System.out.println(list);

    }
}
