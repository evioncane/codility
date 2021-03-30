package lesson2;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] A = {2,3,4};
        int K = 2;
        int[] arr = cyclicRotation.solution(A, K);
    }

    public int[] solution(int[] A, int K) {
        if (A.length == 0){
            return A;
        }
        int realRotation = K % A.length;
        int[] shiftedArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int originalIndex = i - realRotation >= 0 ? i - realRotation: A.length + i - realRotation;
            shiftedArray[i] = A[originalIndex];
        }
        return shiftedArray;
    }
}
