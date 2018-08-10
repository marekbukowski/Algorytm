package pl.marek.software.deweloper.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort implements Sort {

    @Override
    public void sort(int[] input) {
        sort(input, 3);
    }

    private void sort(int[] input, int bucketsize) {

        int minValue = input[0];
        int maxValue = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] < minValue) {
                minValue = input[i];
            }
            if (input[i] > maxValue){
                maxValue = input[i];
            }
        }
        //initialise number of backets
        int bucketCount = (maxValue - minValue) / bucketsize + 1;

        List<List<Integer>> buckets = new ArrayList<>(bucketCount);


        //initialise empty bucekts

        for (int i=0; i<input.length; i++){
            int bucketNumber=(input[i] - minValue) / bucketsize;
            buckets.get(bucketNumber).add(input[i]);
        }

        int currentIndex = 0;
        for (int i= 0; i <bucketCount;i++){
            List<Integer> elementsInBucket = buckets.get(i);
            Collections.sort(elementsInBucket);
            //assign bucket values to output array
            for (int j = 0; j<elementsInBucket.size(); j++ ){
                input[currentIndex++] = elementsInBucket.get(j);
            }
        }
    }
}