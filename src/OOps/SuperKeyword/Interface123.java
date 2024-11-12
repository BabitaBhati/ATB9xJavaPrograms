package OOps.SuperKeyword;

public class Interface123{
    public static void main(String[] args) {
        PP p=new PP();
        p.f1();
        p.f2();
    }
}
class PP implements I2 {

    @Override
    public void f1() {
        System.out.println("f1 method");
    }

    @Override
    public void f2() {
        System.out.println("f2 method");
    }
}
interface I {
    void f1();
    void f2();

        }
