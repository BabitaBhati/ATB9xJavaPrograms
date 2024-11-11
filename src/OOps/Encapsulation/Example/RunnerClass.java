package OOps.Encapsulation.Example;

public class RunnerClass {
    public static void main(String[] args) {
        Test1 tc1 = new Test1(); // Dynamic DisPatch
        tc1.setBrowser("chrome",true);
        tc1.startbrower();
    }
}
