package pl.software.developer.academy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberCounter {

    public int[] initializeTable(int length, int maxValue) {
        Random rn = new Random();
        int [] table = new int[length];
        for (int i=0;i<table.length-1;i++) {
            table[i] = rn.nextInt(maxValue);
        }
        return table;
    }

    public int findMaxNumberOccurs(int [] table) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<table.length-1;i++) {
            if (map.get(table[i])!=null) {
                map.put(table[i], map.get(table[i])+1);
            } else {
                map.put(table[i], 1);
            }
        }
        int maximalValue = 0;
        int maxOccursNumber = -1;
        for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue()>maximalValue) {
                maximalValue = entry.getValue();
                maxOccursNumber = entry.getKey();
            }

            // do something with key and/or tab
        }
        return maxOccursNumber;
    }



}
