package Oct.ex_1610_TakingInput;

import java.util.Scanner;

public class Lab_1610_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        //Print the user input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        sc.close();

    }
}
