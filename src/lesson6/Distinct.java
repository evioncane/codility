package lesson6;

import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {

    }

    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) {
            return 0;
        }
        int elementCount = 1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i+1] != A[i]) {
                elementCount++;
            }
        }

        return elementCount;
    }
}
