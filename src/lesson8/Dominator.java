package lesson8;

public class Dominator {
    public static void main(String[] args) {
        Dominator dominator = new Dominator();
        int[] A = {1,2,3,4,5,5,5,5,5};
        System.out.printf("Result: %d", dominator.solution(A));
    }

    public int solution(int[] A) {
        int size = 0;
        Integer value = null;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                value = A[i];
                size++;
            } else {
                if (!value.equals(A[i])) {
                    size--;
                } else {
                    size++;
                }
            }
        }
        if (value == null) {
            return -1;
        }
        int lastIndex = -1;
        int leaderCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == value) {
                leaderCount++;
                lastIndex = i;
            }
        }
        if (leaderCount > A.length/2) {
            return lastIndex;
        }
        return -1;
    }
}
