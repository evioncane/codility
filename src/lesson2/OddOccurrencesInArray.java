package lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] testArray = {9, 3, 9, 3, 9, 7, 9};
        System.out.printf("The unpaired element is: %d", solution(testArray));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int currentValue = A[0];
        int currentCount = 1;
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] == currentValue) {
                currentCount++;
            }
            else {
                if (currentCount % 2 != 0) {
                    return currentValue;
                }
                else {
                    currentValue = A[i];
                    currentCount = 1;
                }
            }
        }
        return A[A.length - 1];
    }
}
