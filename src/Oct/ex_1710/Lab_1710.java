package Oct.ex_1710;

import java.util.Scanner;

public class Lab_1710 {
    public static void main(String[] args) {
        // Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade");
        int n=sc.nextInt();
        if(n>=90 && n<=100){
            System.out.println("Grade A");
        }else if(n >= 80 && n <=89){
            System.out.println("Grade B");
        }else if(n >= 70 && n <=79){
            System.out.println("Grade C");
        }else if(n >= 60 && n <=69){
            System.out.println("Grade D");
        }else if(n >=0 && n <=59){
            System.out.println("Grade F");
        }else {
            System.out.println("Failed");
        }
    }
}
