package Oct.ex_1510_TernaryOperator;

public class Lab_1510 {
    public static void main(String[] args) {
        //largerst of numbers
        int a = 50,b= 90, c = 100;
        System.out.println("The numbers are a = 40,b= 70, c = 60");
        String larg =  ((a > b) && (a > c))? "a is larger "+a : (b > c)? "b is larger "+b: "c is larger "+c;
        System.out.println(larg);

        int i= 10;
        System.out.println(++i + i++ + i++);//++i 11 11, i++ 11 12, i++ 12 13
        System.out.println(i);
    //
        int e= 20;
        System.out.println(--e + e++ + e--);//--e 19 19,e++ 19 20, e-- 20 19
        System.out.println(e);
        //(a>b && a>c)+a: (b > c)? +b: "c is larger "+c

    }
}
