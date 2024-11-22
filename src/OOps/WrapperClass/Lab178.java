package OOps.WrapperClass;

public class Lab178 {
    public static void main(String[] args) {
        System.out.println("start");
        String s=null;
        try {
            s.trim();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Can't do trim for null");
        }
        System.out.println("End");
    }
}
