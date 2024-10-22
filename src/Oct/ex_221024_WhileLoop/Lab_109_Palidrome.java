package Oct.ex_221024_WhileLoop;

import java.util.Scanner;

public class Lab_109_Palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if it's a palindrome:");
        String in = sc.nextLine();   // Take input
        String reverse = "";// Empty string to store the reverse

        // Reverse the string using a loop
        for (int i = in.length() - 1; i >= 0; i--) {
            reverse = reverse + in.charAt(i); // Add each character from the end of original string
        }

        // Check if the original and reverse strings are the same
        if (in.equals(reverse)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

    }
}
