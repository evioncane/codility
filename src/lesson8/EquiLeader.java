package lesson8;

public class EquiLeader {
    public static void main(String[] args) {
        EquiLeader equiLeader = new EquiLeader();
        int[] A = {1,1,1,1,0,0,0,0};
        System.out.printf("Result is: %d", equiLeader.solution(A));
        System.out.println();
    }

    public int solution(int[] A) {
        int equiNumber = 0;
        int size = 0;
        Integer leaderCandidate = null;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                size++;
                leaderCandidate = A[i];
            } else if (!leaderCandidate.equals(A[i])) {
                size--;
            } else {
                size++;
            }
        }
        if (leaderCandidate == null) {
            return 0;
        }
        int leaderCandidateCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leaderCandidate) {
                leaderCandidateCount++;
            }
        }
        if (leaderCandidateCount <= A.length/2) {
            return 0;
        }
        int localLeaderCount = 0;
        for (int i = 0; i< A.length; i++) {
            if (A[i] == leaderCandidate) {
                localLeaderCount++;
            }
            if (localLeaderCount > (i+1)/2 && (leaderCandidateCount - localLeaderCount) > ((A.length-(i+1))/2)){
                equiNumber++;
            }
        }

        return equiNumber;
    }
}
