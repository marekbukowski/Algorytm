package pl.software.developer.academy;

import java.util.List;
import java.util.Scanner;

public class ArithmeticSequence {

    public void printArithmeticSequence(int firstElement, int difference, int numberOfElement) {

        System.out.println("1 element value="+firstElement);
        int currentNumber = firstElement;
        for (int i=1;i<=numberOfElement;i++) {
            currentNumber = currentNumber + difference;
            System.out.println(i+1+" element value="+currentNumber);
        }
    }
}
