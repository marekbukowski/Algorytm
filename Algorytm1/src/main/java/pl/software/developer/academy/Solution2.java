package pl.software.developer.academy;

public class Solution2 {

    public int solution(String S) {
        // write your code in Java SE 8

        char[] B = S.toCharArray();
        int L =0;
        int R =0;
        int workers = 0;

        for (int i = 0; i < B.length; i++){
            if (B[i] == 'L'){
                L++;
            }else R++;
            if (L == R && L != 0){
                workers++;
            }
        }

        return workers;
    }

    public static void main(String[] args) {

        Solution2 solution2 = new Solution2();

        String B = "RLLLRRRLLR";

        String C = "LLRLRLRLRLRLRR";

        System.out.println(solution2.solution(B));
        System.out.println(solution2.solution(C));
    }
}

