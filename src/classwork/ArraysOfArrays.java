package classwork;
//import java.util.Scanner;
public class ArraysOfArrays {
    public static void main(String[] args) {
        char[][] ticTacToe;
        ticTacToe = new char[][]{{'X', 'O', 'O'}, {'X', 'X', 'X'}, {'O', 'O', 'X'}};
        for(int n =0; n< ticTacToe.length;n++){
          for(int x = 0; x<ticTacToe[n].length; x++){
              System.out.print(ticTacToe[n][x] +" ");
          }
            System.out.println();
        }
    }
}
