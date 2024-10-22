package Oct.ex_221024_WhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class Lab_108_VowelsCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String in=sc.nextLine().toLowerCase();

        int v=0, con=0;
        for (int i=0;i<in.length();i++){
            char ch=in.charAt(i);
           //Check if character is vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            }
            // Check if the character is a consonant (a letter but not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                con++;
            }
        }

        System.out.println("Number of vowels: " + v);
        System.out.println("Number of consonants: " + con);
    }
}