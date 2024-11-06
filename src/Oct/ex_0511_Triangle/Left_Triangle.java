package Oct.ex_0511_Triangle;

public class Left_Triangle {
    public static void main(String[] args) {
        int row, numberOfRows=5,column;

        /*for (row = 0; row < numberOfRows; row++) {
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
            System.out.println();*/
        for(row=0; row<numberOfRows; row++){
            for(column= 2 * (numberOfRows-row); column > 2 ; column--){
                System.out.print(" ");
            }
            for (column= 0 ;column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
