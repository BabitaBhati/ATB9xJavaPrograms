package Oct.ex_291024_Array;

public class Lab_Triangle {
    public static void main(String[] args) {
        int row, column, numberOfRows = 5;
        //this iterates through each row of triangle and row starts with 0 and ends with numberofrows
        for (row = 0; row < numberOfRows; row++) {
         //this loop print space before * in each row to create alignment and number of space cal.
            //by 2*(numberofRows) that ensure the move down the rows
            for (column = 2 * (numberOfRows - row); column > 2; column--) {
                System.out.print(" ");
            }
         //print the * for current row and * printed as row+1 bez start with 0 and ends with row
            for (column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            //To move cursor to new line for each row
            System.out.println();
        }
    }
}