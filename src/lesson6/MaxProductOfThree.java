package lesson6;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        int[] A = {-3,-3,-3,-4,1,2,2,8,5};
        System.out.printf("Maximal product: %d", maxProductOfThree.solution(A));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        int maxProduct = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        int[] leftEndArray = {A[0], A[1], A[2]};
        int leftNegativeCount = 0;
        for (int i = 0; i < 3; i++) {
            if (A[i] < 0) {
                leftNegativeCount++;
            }
        }
        if(leftNegativeCount > 1) {
            int potentialMax = A[0] * A[1] * A[A.length - 1];
            if (potentialMax > maxProduct) {
                maxProduct = potentialMax;
            }
        }
        return maxProduct;
    }
}
