package OOps.StaticKeyword;

public class StaticBlock {
    public static void main(String[] args) {
        AA a= new AA();
        AA a1=new AA();
        new AA();
        AA a2;

    }
}



class AA{
    static {
        System.out.println("static block");
    }
    {
        System.out.println("Not a static block");
    }
}
