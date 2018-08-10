package pl.marek.software.deweloper.sort;

public class CountingSort implements Sort {

    @Override
    public void sort(int[] input) {

    }

    private void sort(char array[]) {
        int n = array.length;
        char output[] = new char[n];
        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; i++)
            count[i] = 0;

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array

        for (int i = 0; i < n; i++) {
            output[count[array[i]] - 1] = array[i];
            --count[array[i]];
        }
        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; i++)
            array[i] = output[i];
    }
}

