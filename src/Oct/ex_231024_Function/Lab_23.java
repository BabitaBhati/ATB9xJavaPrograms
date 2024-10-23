package Oct.ex_231024_Function;

import java.util.Scanner;

public class Lab_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Voting age:");
        int vote = sc.nextInt();
        if (vote >= age_of_vote()) {
            System.out.println("you are allowed");
        } else {
            System.out.println("you are not allowed!");
                }
    }

        static int age_of_vote() {
            System.out.println("Voting age");
            return 18;

    }
}