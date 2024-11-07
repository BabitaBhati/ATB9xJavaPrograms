package OOps.Single_Inheritence.Real_example_1;

public class Test2 extends BaseClass{
    Test2(){
        System.out.println("DC - Child");
    }

    void test2(){
        startBrowser();
        System.out.println("TC2 Executing");
        readExcelFile();
        closeBrowser();
    }
}
