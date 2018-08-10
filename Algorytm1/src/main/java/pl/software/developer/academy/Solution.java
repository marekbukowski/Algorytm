package pl.software.developer.academy;


import java.util.Arrays;

public class Solution {

    int N = 0;

    public int solution(int[] A) {
        // write your code in Java SE 8

        N = A.length;
        int minimum = Integer.MAX_VALUE;
        int tmp = Integer.MAX_VALUE;

        Arrays.sort(A);


            for (int i = 0; i < N; i++){
                tmp = 0;
                for (int j = 0; j < N; j++){
                    if (A[i] + A[j] == 7){
                    tmp +=2;
                    }
                    else if (A[i] == A[j]){
                        tmp +=0;
                    }
                    else {
                        tmp += 1;
                    }
                }
                    if (tmp < minimum){
                    minimum = tmp;
                    }
            }


return minimum;


    }

    boolean checkIfequals(int[] A) {

        if (N < 2){
            return false;
        }

        for (int i = 0; i < N-1; i++) {
            if (A[i] != A[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int [] A = new int[]{1,6,1,6,1,6};

        System.out.println(solution.solution(A));
    }
}
