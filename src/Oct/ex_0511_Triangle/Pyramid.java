package Oct.ex_0511_Triangle;

public class Pyramid {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            //Print the space
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
