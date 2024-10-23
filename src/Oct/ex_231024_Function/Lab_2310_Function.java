package Oct.ex_231024_Function;

import java.util.Scanner;

public class Lab_2310_Function {
    public static void main(String[] args) {
       /* Create a Function of Sub, Sum, Mul and Div with parameter, a, b
        (take the parameter from the User)
        3 → user input
        4 - user input*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fist Number:");
        int s = sc.nextInt();
        System.out.println("Enter Second Number:");
        int s2 = sc.nextInt();
        Sub(s, s2);
        Add(s, s2);
        Multi(s, s2);
        div(s,s2);
    }

    static void Sub(int a, int b) {
        int d = a - b;
        System.out.println("The Sub Number is : " + d);
    }

    static void Add(int a, int b) {
        int d1 = a + b;
        System.out.println("The Add Number is : " + d1);
    }

    static void Multi(int a, int b) {
        int d2 = a * b;
        System.out.println("The Multi Number is : " + d2);
    }
    static void div(int a, int b) {
        int d3 = a * b;
        System.out.println("The dev Number is : " + d3);
    }
}
