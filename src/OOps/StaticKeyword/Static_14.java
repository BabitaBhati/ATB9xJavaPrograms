package OOps.StaticKeyword;

public class Static_14 {
    public static void main(String[] args) {
        Student12 s=new Student12(18);
        System.out.println(Student12.student_name);
        Student12.student_name="Radha";
        //Updated name
       // System.out.println(s.student_name);
        System.out.println(Student12.student_name);
    }
}




class Student12 {
    int age;
    static String student_name="Ram";

    public Student12(int age){
        this.age=age;
    }
    {
        System.out.println("Data");
        System.out.println("Data is loaded when object is created");
    }
    static {
        System.out.println("Main");
        System.out.println("class is loaded");
        System.out.println("Read the data");
    }
}