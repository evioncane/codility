package lesson3;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] A = {1};
        System.out.printf("Number missing is: %d", permMissingElem.solution(A));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0 || A[0] != 1) {
            return 1;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] == A[i] + 2) {
                return A[i] + 1;
            }
        }
        return A[A.length - 1] + 1;
    }
}
