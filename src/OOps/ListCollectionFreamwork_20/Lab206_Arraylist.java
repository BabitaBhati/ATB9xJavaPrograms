package OOps.ListCollectionFreamwork_20;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab206_Arraylist {
    public static void main(String[] args) {
        // Multiple inputs from the user and store them in separate
        // ArrayLists based on user-defined categories.

        // names, ages - store them
        //User input
        Scanner sc=new Scanner(System.in);

        ArrayList<String> ar=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();

        String input="Y";// Control variable for input loop

        while (input.equalsIgnoreCase("Y")){
            System.out.println("Enter name: ");
            String name=sc.nextLine();
            ar.add(name);

            System.out.println("Enter Age: ");
            int age=sc.nextInt();
            ar2.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N):" );
            input=sc.nextLine();
        }
        System.out.println("Name: " +ar);
        System.out.println("Age :"+ ar2);

        for (Object o:ar){
            System.out.println(ar);
        }
        for (Object o1:ar2){
            System.out.println(ar2);
        }
        sc.close();
    }
}
