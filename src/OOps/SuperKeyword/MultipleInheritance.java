package OOps.SuperKeyword;

public class MultipleInheritance {

    public static void main(String[] args) {
        child1 ch=new child1();
        ch.Food();
        ch.Home();
        ch.Money();
        ch.Permision();
    }
}
class child1 implements father,Mother{
    String name;
    child1(){
        System.out.println("Default constructor");
    }
    child1(String name){
        this.name="name";
        System.out.println("Name:"+name);
    }

    @Override
    public void Permision() {
        System.out.println("Mother Permission");
    }

    @Override
    public void Food() {
        System.out.println("Mother's hand food");
    }

    @Override
    public void Home() {
        System.out.println("Father's home");
    }

    @Override
    public void Money() {
        System.out.println("Father's Money");
    }
}



interface father{
    void Home();
    void Money();

}


interface Mother{
    void Permision();
    void Food();
}
