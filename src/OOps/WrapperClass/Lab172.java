package OOps.WrapperClass;

public class Lab172 {
    public static void main(String[] args) {
        int a=10;

        Integer i=a;//Boxing--int-->Integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        i.intValue();

        Integer i1=22;
        int val=i1;//Unboxing----Interger----->int
        System.out.println(val);

    }
}
