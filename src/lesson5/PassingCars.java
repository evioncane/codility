package lesson5;

public class PassingCars {
    public static void main(String[] args) {
        PassingCars passingCars = new PassingCars();
        int[] A = {0, 0 ,0 ,0, 1,1,0,1};
        System.out.printf("Total number of pairs is: %d", passingCars.solution(A));
    }

    public int solution(int[] A) {
        int[] zeroCountArray = new int[A.length + 1];
        // count all zeros
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeroCountArray[i+1] = zeroCountArray[i] + 1;
            }
            else {
                zeroCountArray[i+1] = zeroCountArray[i];
            }
        }
        int lastIndexChange = 0;
        int pairNumber = 0;
        for (int i = 1; i < zeroCountArray.length; i++) {
            if (zeroCountArray[i] == zeroCountArray[i-1] + 1) {
                pairNumber += zeroCountArray[i-1] * (i - lastIndexChange - 1);
                if (pairNumber > 1_000_000_000 || pairNumber < 0) {
                    return -1;
                }
                lastIndexChange = i;
            }
            else if (i == zeroCountArray.length - 1) {
                pairNumber += zeroCountArray[i] * (i - lastIndexChange);
                if (pairNumber > 1_000_000_000 || pairNumber < 0) {
                    return -1;
                }
            }
        }

        return pairNumber;
    }
}
