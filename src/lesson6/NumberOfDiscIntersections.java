package lesson6;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        int[] A = {1,5,2,1,4,0};
        System.out.printf("Number of intersections: %d", numberOfDiscIntersections.solution(A));
    }

    public int solution(int[] A) {
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            lower[i] = i - A[i];
            upper[i] = i + A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int intersectionNumber = 0;
        int j = 0;

        for (int i = 0; i < A.length; i++) {
            while (j < A.length && upper[i] >= lower[j]) {
                intersectionNumber = intersectionNumber + j;
                intersectionNumber = intersectionNumber - i;
                j++;
            }
        }

        if (intersectionNumber > 10_000_000) {
            return -1;
        }

        return intersectionNumber;
    }
}
