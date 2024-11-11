package OOps.Encapsulation.Example;

public class Test1  extends  BaseClass{

    public Test1(){
        super();
        System.out.println("Test-1");
    }

    public void startbrower(){
        openBrowser();
        closeBrowser();

    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Base Logic");
        super.setBrowser(browser, isAuth);
    }
    public String toString(){
        return "Test1";
    }
}
