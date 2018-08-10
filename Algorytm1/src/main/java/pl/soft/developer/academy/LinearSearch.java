package pl.soft.developer.academy;

import java.util.NoSuchElementException;

/*
Zaimplementuj algorytmy wyszukiwania liniowego i wyszukiwania binarnego.
Przetestuj oba algorytmy dla różnych danych (różne wielkości danych, różne
miejsca położenia szukanego elementu…), przeanalizuj ilości wykonanych
porównań.
 */


public class LinearSearch implements Search{

    private int stepCounter;


    public boolean findElement(int value, int[] input) throws NoSuchElementException {
        for (int i=0; i<input.length;i++){
            stepCounter++;
            if (input [i]==value){
                return true;
            }
        }
        throw new NoSuchElementException("There is no value in table "+ value + "in table");
    }

    public int getStepCounter(){
        return stepCounter;
    }
}
