package pl.software.developer.academy;

import java.util.Random;

public class Tower {

    public int[][] drawTowers(int numberOfTowers) {
        int [][] chessFields = new int[8][8];
        Random rn = new Random();
        for (int i=0;i<numberOfTowers;i++) {
            int x = rn.nextInt(7);
            int y = rn.nextInt(7);
            chessFields[x][y]=1;
        }
        return chessFields;
    }

    public boolean towerBeat(int [][] board) {
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[i].length;j++) {
                if (board[i][j]==1) {
                    for (int k=0;k<board.length;k++) {
                        if (k!=i) {
                            if (board[k][j]==1)
                                return true;
                        }
                    }
                    for (int l=0;l<board.length;l++) {
                        if (l!=j) {
                            if (board[i][l]==1)
                                return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
