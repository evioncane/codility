package lesson4;

import java.util.Arrays;

public class FrogRiverOne {
    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int[] A = {1,1,1};
        int X = 3;
        System.out.printf("Time Needed is: %d", frogRiverOne.solution(X, A));
    }

    public int solution(int X, int[] A) {
        int[] positionArray = new int[X];
        Arrays.fill(positionArray, -1);
        int waitTime = 0;
        for (int i = 0; i < A.length; i++) {
            if (positionArray[A[i]-1] == -1) {
                positionArray[A[i]-1] = i;
                if (waitTime < i) {
                    waitTime = i;
                }
            }
        }
        for (int i = 0; i < positionArray.length; i++) {
            if (positionArray[i] == -1) {
                return -1;
            }
        }
        return waitTime;
    }
}
