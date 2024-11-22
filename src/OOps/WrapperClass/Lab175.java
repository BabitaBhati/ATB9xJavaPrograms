package OOps.WrapperClass;

public class Lab175 {
    public static void main(String[] args) {
        String s=args[0];//ArrayIndexoutofexception

        int a=Integer.parseInt(s);
        int b=10000/a;//ArithmeticException/by zero
        System.out.println(b);
    }
}
