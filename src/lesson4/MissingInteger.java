package lesson4;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        int[] A = {0};
        System.out.printf("Smallest non accuring positive int is: %d", missingInteger.solution(A));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        boolean positiveSectionStarted = false;
        int maxConsecutiveValue = 1;
        for (int i = 0; i < A.length; i++) {
            if (!positiveSectionStarted && A[i] > 0) {
                if (A[i] > 1) {
                    return 1;
                }
                positiveSectionStarted = true;
            }
            if (positiveSectionStarted) {
                if (A[i] > maxConsecutiveValue + 1) {
                    return maxConsecutiveValue + 1;
                }
                maxConsecutiveValue = A[i];
            }

        }
        if (!positiveSectionStarted) {
            return 1;
        }
        return A[A.length - 1] + 1;
    }
}
