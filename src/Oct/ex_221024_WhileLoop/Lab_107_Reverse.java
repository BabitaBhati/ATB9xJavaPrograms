package Oct.ex_221024_WhileLoop;

import java.util.Scanner;

public class Lab_107_Reverse {
    public static void main(String[] args) {
        //without using scanner class

       /* int n=12345 ,reverse=0;
        for (; n!=0; n=n/10){
            int re=n%10;
            reverse=reverse*10+re;
        }
        System.out.println("reverse number:"+reverse);
    }*/
        //using scanner class
    int n1=0 ,reverse1=0;
    System.out.println("Enter the Number :");
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        n1 = in.nextInt();
        for(;n1!=0;){
            reverse1=reverse1 * 10;
            reverse1= reverse1 + n1% 10;
            n1=n1/10;
        }
        System.out.println("Reverse number print:"+reverse1);

        }

}
