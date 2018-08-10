package pl.soft.developer.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiagonalMatrixTest {

    @Test
    public void print() {

        DiagonalMatrix diagonalMatrix = new DiagonalMatrix();
        diagonalMatrix.print(5);

    }

    @Test
    public void printFaster(){
        DiagonalMatrix diagonalMatrix = new DiagonalMatrix();
        diagonalMatrix.printFaster(5);
    }
}