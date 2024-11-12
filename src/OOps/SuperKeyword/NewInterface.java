package OOps.SuperKeyword;

public class NewInterface {
    public static void main(String[] args) {

    }
}


abstract class ABC{
    ABC(){

    }
    //abstract method does not have body.
    abstract void m1();

    void m2(){
        System.out.println("Complete Method!");
    }
}

interface IA {
    void m1();
    void m2();

    default void m4() {
        System.out.println("Default method");
    }

    default void m5() {
        System.out.println("Default method in Interface!");
    }

    static void m6() {
        System.out.println("Static method in Interface!");
    }

}

