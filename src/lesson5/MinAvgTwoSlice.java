package lesson5;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        int[] A = {4,2,2,5,1,5,8};
        System.out.printf("Start index of minimal average slice: %d", minAvgTwoSlice.solution(A));
    }

    public int solution(int[] A) {
        float min_avg = Float.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < A.length - 2; i++) {
            float avg_2 = ((float)(A[i] + A[i+1]))/2;
            float avg_3 = ((float)(A[i] + A[i+1] + A[i+2]))/3;

            float current_min = Math.min(avg_2, avg_3);

            if (current_min < min_avg) {
                min_avg = current_min;
                min_index = i;
            }
        }

        float avg_2 = ((float)(A[A.length - 2] + A[A.length - 1]))/2;
        if (avg_2 < min_avg) {
            return A.length - 2;
        }

        return min_index;
    }
}
