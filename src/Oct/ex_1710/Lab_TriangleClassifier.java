package Oct.ex_1710;

import java.util.Scanner;

public class Lab_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side1 :");
        int s1 = sc.nextInt();
        System.out.println("Enter Side2 :");
        int s2 = sc.nextInt();
        System.out.println("Enter Side3 :");
        int s3 = sc.nextInt();
        if (s1 == s2 && s2 == s3 && s3 == s1) {
            System.out.println("Equilateral Triangle");
        } else if (s1 == s2 || s2 == s3 || s3 == s1) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
