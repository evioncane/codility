package lesson4;

public class MaxCounters {
    public static void main(String[] args) {
        MaxCounters maxCounters = new MaxCounters();
        int[] A = {3};
        int N = 2;
        int[] sol = maxCounters.solution(N, A);
    }

    public int[] solution(int N, int[] A) {
        int[] counterArray = new int[N];
        int maxValue = 0;
        int minValue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (counterArray[A[i]-1] < minValue) {
                    counterArray[A[i]-1] = minValue;
                }
                increase(counterArray, A[i]);
                if (counterArray[A[i]-1] > maxValue) {
                    maxValue = counterArray[A[i]-1];
                }
            }
            else if (A[i] == N+1) {
                minValue = maxValue;
            }
        }
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] < minValue) {
                counterArray[i] = minValue;
            }
        }
        return counterArray;
    }

    private void increase(int[] counterArray, int x) {
        counterArray[x-1] += 1;
    }
}
