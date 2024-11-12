package OOps.SuperKeyword.AbstractClass;

public class Lab157 {
    public static void main(String[] args) {
        A a = new A();
        a.Loan50k();
        a.Loan1k();
    }

}
class A extends Test1{
    @Override
    void Loan80k() {
        System.out.println("80k Loan");
    }

    @Override
    void Loan50k() {
        System.out.println("50k Loan");
    }
}
    abstract class Test1{
        abstract void Loan50k();
        abstract void Loan80k();

        void Loan1k(){
            System.out.println("1K Loan");
        }
    }

