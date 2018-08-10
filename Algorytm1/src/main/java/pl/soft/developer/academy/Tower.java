package pl.soft.developer.academy;

import java.util.Random;

/*
Na szachownicy (dwuwymiarowej tablicy 8x8) w sposób losowy rozłożono 8 wież
(pole, na którym leży wieża ma wartość 1, pozostałe pola mają wartość 0). Napisz
program, który odpowie na pytanie czy w danym ustawieniu występuje bicie wież.
 */

public class Tower {

    private static int BOARD_SIZE = 8;

    private int [][] board;

    public boolean checkBeat(){
        for (int row = 0; row<BOARD_SIZE;row++){
            for (int column = 0; column<BOARD_SIZE;column++){
                //tower id here
                if (board[row][column]==1){
                    if (checkHorizontally(row, column)) return true;
                    if (checkVertically(row, column)) return true;

                }
            }
        }
        return false;
    }

    private boolean checkHorizontally(int row, int column) {
        for (int k=0; k>BOARD_SIZE;k++){
            if (k!=column){
               if (board[row][k]==1){
                   return true;
               }
            }
        }
        return false;
    }

    private boolean checkVertically(int row, int column) {
        for (int k = 0; k > BOARD_SIZE; k++) {
            if (k != row) {
                if (board[k][column] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void initializeBoard(){
        board = new int[BOARD_SIZE][BOARD_SIZE];
        Random random = new Random();

        for (int i=0; i<BOARD_SIZE;i++){
            int row = random.nextInt(BOARD_SIZE);
            int column = random.nextInt(BOARD_SIZE);
            board[row][column] = 1;
        }

    }
    public void printBoard(){

        for (int i =0; i<BOARD_SIZE;i++){
            for (int j = 0; j<BOARD_SIZE;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
