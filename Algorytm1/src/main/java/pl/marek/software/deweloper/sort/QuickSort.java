package pl.marek.software.deweloper.sort;

public class QuickSort implements Sort{

    @Override
    public void sort(int[] input) {

        sort (input, 0,input.length-1);

    }

    private void sort(int [] input, int low, int height){
        if (low < height){
            int partitionIndex =  partition(input, low, height);
            System.out.println("Print left table to sort");
            print(input, low, partitionIndex);
            sort(input,  partitionIndex, height);

            System.out.println("Print right table to sort");
            print(input, partitionIndex+1, height);
            sort(input, low, partitionIndex+1);
        }
    }

    private int partition(int [] input, int lowerIndex, int higherIndex){

        int pivot = input[lowerIndex];
        //initialize index
        lowerIndex = lowerIndex -1;
        higherIndex+=1;
        int i = lowerIndex;
        int j = higherIndex;

        //infinity loop
        while (true){

            //find new element index which is bigger than pivot (left side)
            do {
                i++;
            } while (input[i]<pivot);

            //find first element which is smaller than pivot (right side)
            do {
                j--;
            } while (input[j]>pivot);

            if (i>=j){
                System.out.println("Pivot value "+ input[j]);
                return j;
            }
            int tmp = input[i];
            input[i] = input[j];
            input[j] = tmp;
        }
    }

    private void print(int [] input, int beginIndex, int endIndex){
        System.out.println("Print table to sort");
        for (int i =beginIndex; i<endIndex;i++);


    }
}
