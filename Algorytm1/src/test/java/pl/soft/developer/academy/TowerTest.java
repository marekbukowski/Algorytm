package pl.soft.developer.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TowerTest {
    @Test
    public void checkBeat() {
        Tower tower = new Tower();
        tower.initializeBoard();
        tower.printBoard();
        boolean beated=tower.checkBeat();
    }

}