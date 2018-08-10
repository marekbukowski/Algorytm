package pl.software.developer.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TowerTest {

    @Test
    public void drawTowers() {
        Tower tower = new Tower();
        int chessFields[][] = tower.drawTowers(8);

        for (int i=0;i<chessFields.length;i++) {
            for (int j=0;j<chessFields[i].length;j++) {
                System.out.print(chessFields[i][j]+" ");
            }
            System.out.println();
        }
    }


    @Test
    public void towerBeat() {
        Tower tower = new Tower();
        int chessFields[][] = tower.drawTowers(3);

        for (int i=0;i<chessFields.length;i++) {
            for (int j=0;j<chessFields[i].length;j++) {
                System.out.print(chessFields[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("TOWER BEAT"+tower.towerBeat(chessFields));
    }
}