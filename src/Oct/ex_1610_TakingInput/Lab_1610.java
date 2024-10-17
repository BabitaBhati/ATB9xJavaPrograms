package Oct.ex_1610_TakingInput;

import java.util.Scanner;

public class Lab_1610 {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        System.out.println(age > 25? "go to goa": "Not Allowed");
        int x=10;
        int y=20;
        int max=(x>y) ? x:y;
        System.out.println(max);
    }
}
