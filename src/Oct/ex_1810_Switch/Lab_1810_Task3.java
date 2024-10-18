package Oct.ex_1810_Switch;

import java.util.Scanner;

public class Lab_1810_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an option (1-4) : " +
                "1.Kilometers to Miles , 2.Miles to Kilometers " +
                "3.Celsius to Fahrenheit, 4.Fahrenheit to Celsius:");

        int place = sc.nextInt();
        double input, result;

        switch (place) {
            case 1:
                System.out.print("Enter the distance in km: ");
                input = sc.nextDouble();
                result = input * 0.621371;
                System.out.println(input + " kilometers is " + result + " miles.");
                break;

            case 2:
                System.out.print("Enter the distance in miles: ");
                input = sc.nextDouble();
                result = input / 0.621371;
                System.out.println(input + " miles is " + result + " kilometers.");
                break;

            case 3:
                System.out.print("Enter the temperature in Celsius: ");
                input = sc.nextDouble();
                result = (input * 9/5) + 32;
                System.out.println(input + " degrees Celsius is " + result + " degrees Fahrenheit.");
                break;

            case 4:
                System.out.print("Enter the temperature in Fahrenheit: ");
                input = sc.nextDouble();
                result = (input - 32) * 5/9;
                System.out.println(input + " degrees Fahrenheit is " + result + " degrees Celsius.");
                break;

            default:
                System.out.println("Invalid selection. Please select a valid option (1-4).");
        }

        sc.close();
    }
}
