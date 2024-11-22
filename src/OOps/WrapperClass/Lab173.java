package OOps.WrapperClass;

public class Lab173 {
    public static void main(String[] args) {
        String s="10";

        Integer in=Integer.valueOf(s);

        int n=in;//unboxing
        //string to primitive
        int n2=Integer.parseInt(s);

        System.out.println(n2);
    }
}
