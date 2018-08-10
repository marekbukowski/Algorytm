package pl.software.developer.academy;

public class PrimeNumber {

    public boolean isPrime(int n) {
        // 2 * i
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
