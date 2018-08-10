package pl.soft.developer.academy;

/*
Napisz program, który odpowie na pytanie czy liczba wskazana przez użytkownika
jest liczbą pierwszą .
 */

public class Prime {

    public int getValue() {
        return value;
    }

    private int value;

    public Prime(int value){
        this.value = value;
    }

    public boolean isPrime(){

        for (int i = 2; i*2<value; i++){
            if (value%i==0)
                return false;
        }
        return true;
    }
}
