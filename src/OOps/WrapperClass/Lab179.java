package OOps.WrapperClass;

public class Lab179 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            b=10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
