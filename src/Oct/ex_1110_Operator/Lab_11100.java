package Oct.ex_1110_Operator;

public class Lab_11100 {
    public static void main(String[] args) {
        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
//Unary Operator
        int a=10;
        System.out.println("Unary");
        System.out.println(a++ + ++a);
        //Arithmetic Operator
        int b=5;
        System.out.println("Arithmetic");
        System.out.println(a+b);
        //Shift
        System.out.println("Shift");
        System.out.println(10<<2);
        //Relational
        System.out.println("Relational");
        System.out.println(10<=2);

        //logical And operator
        int c=20;
        System.out.println("Logical and Operator");
        System.out.println(a<b&&a<c);
        System.out.println(a>b||a<c);
        //Bitwise
        System.out.println("Bitwise");
        System.out.println(a>b|a<c);//true | true = true
        //Ternary
        System.out.println("Ternary");
        int min=(a<b)?a:b;
        System.out.println(min);
        //Assignment
        System.out.println("Assignment");
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);
    }

}
