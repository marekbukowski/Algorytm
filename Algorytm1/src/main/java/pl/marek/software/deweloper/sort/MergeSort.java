package pl.marek.software.deweloper.sort;

public class MergeSort implements Sort{

    @Override
    public void sort(int[] input) {

    }

    private void merge(int array[], int leftIndex, int middle, int rightIndex){

        int n1 = middle - leftIndex + 1;
        int n2 = rightIndex - middle;

        //create temp arrays
        int leftArray[] = new int[n1];
        int rightArray[] = new int [n2];


        //copy data to temp arrays
        for (int i = 0; i < n1; i++)
        leftArray[i] = array[leftIndex + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = array[middle + 1 + j];

        int i = 0;
        int j = 0;

        //initial index of merged subarry array
        int k = leftIndex;
        while (i < n1&& j < n2)
        {
            if (leftArray[i] <= rightArray[j])
            {
                    array[k] = leftArray[i];
                    i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //copy remaining elements of left array if any
        while (j < n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }
    public void sort(int array[], int leftIndex, int rightIndex){
        if (leftIndex < rightIndex){
            //find the middle point
            int middle = (1 + rightIndex)/2;
            //sort first and second halves
            sort(array, middle, leftIndex);
            sort(array, middle +1, rightIndex);
            merge(array, leftIndex, middle,rightIndex);
        }
    }
    public static void printArray(int array[]){
        int n = array.length;
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    }

