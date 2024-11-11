package OOps.Encapsulation.Example;

public class BaseClass {

    private String browser;

    //Default constructor
    BaseClass(){
        System.out.println("BaseClass");
    }
    //Parameterised Cons
    BaseClass(String b){
        System.out.println("BaseClass");
    }

    //getter method using the variable(Encapsulation)
    public String getBrowser() {
        return browser;
    }
    //setter method using the variable(Encapsulation)
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    //Normal methods
    void openBrowser() {
        System.out.println("Opening Browser!!");

    }
    //
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");


    }
}
