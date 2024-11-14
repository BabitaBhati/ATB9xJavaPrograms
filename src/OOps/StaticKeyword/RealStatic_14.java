package OOps.StaticKeyword;

public class RealStatic_14 {

    public static void main(String[] args) {
        Employee e=new Employee("Ram");
        Employee e1=new Employee("Radha");
        Employee e2=new Employee("TATA");

        Employee e4;
        new Employee("RR");
        e.documents();
        Employee.Doassignment();
        System.out.println(Employee.add);
    }
}



class Employee{
    static {
        System.out.println("static block");
    }
    {
        System.out.println("non-static block");
    }

    private String name;
    private String phone;
    static String add;

    public Employee(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add = add;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    void documents(){
        System.out.println("non-static method");
    }
    static void Doassignment(){
        System.out.println("static method");
    }

}
