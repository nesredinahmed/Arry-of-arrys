import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //3x3 board
        char[][] rows = {
                {'.','.','.'}, // row 0
                {'.','.','.'}, // row 1
                {'.','.','.'}, // row 2
                //0   1   2 positions in a row
        };
        rows[1][1] = 'X';

        //DISPLAY THE WHOLE BOARD
        for(int r = 0; r < rows.length; r++){
            for(int c = 0; c < rows[r].length; c++) {
                System.out.print(rows[r][c]); //on character - stacked left to right
                System.out.print(' ');
            }
            System.out.print("\n"); //new line
        }
    }
}