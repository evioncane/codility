package lesson3;

public class TapeEquilibrium {
    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] A = {3,-1,-2};
        System.out.printf("Smallest sum is: %d", tapeEquilibrium.solution(A));
    }

    public int solution(int[] A) {
        int rightSum = 0;
        int leftSum = A[0];
        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }
        int smallestDiff = Math.abs(leftSum - rightSum);
        for (int i = 1; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            final int currentDiff = Math.abs(leftSum - rightSum);
            if (currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
            }
        }
        return smallestDiff;
    }
}
