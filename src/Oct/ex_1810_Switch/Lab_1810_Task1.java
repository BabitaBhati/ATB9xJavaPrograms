package Oct.ex_1810_Switch;

import java.util.Scanner;

public class Lab_1810_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator(1: Add, 2: subtraction, 3: multiplication, 4:division, 5: modulus)?");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4 :
                System.out.println(num1/num2);
                break;
            case 5 :
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("invalid operation");
                sc.close();
         }

    }
}
