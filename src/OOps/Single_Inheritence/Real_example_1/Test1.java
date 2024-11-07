package OOps.Single_Inheritence.Real_example_1;

public class Test1 extends BaseClass{
    public Test1(){
        System.out.println("DC - Child");
    }

    public void test1(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
