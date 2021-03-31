package lesson5;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] solutionArray = genomicRangeQuery.solution(S, P, Q);
    }

    public int[] solution(String S, int[] P, int[] Q) {
        int[] solution = new int[P.length];

        int[] A = new int[S.length() + 1];
        int[] C = new int[S.length() + 1];
        int[] G = new int[S.length() + 1];
        int[] T = new int[S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                A[i+1] = A[i] + 1;
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i];
            } else if (S.charAt(i) == 'C') {
                A[i+1] = A[i];
                C[i+1] = C[i] + 1;
                G[i+1] = G[i];
                T[i+1] = T[i];
            } else if (S.charAt(i) == 'G') {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i] + 1;
                T[i+1] = T[i];
            } else if (S.charAt(i) == 'T') {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i];
                T[i+1] = T[i] + 1;
            }
        }

        for (int i = 0; i < P.length; i++) {
            int a = A[Q[i] + 1] - A[P[i]];
            int c = C[Q[i] + 1] - C[P[i]];
            int g = G[Q[i] + 1] - G[P[i]];

            if (a > 0) {
                solution[i] = 1;
            } else if (c > 0) {
                solution[i] = 2;
            } else if (g > 0) {
                solution[i] = 3;
            }
            else {
                solution[i] = 4;
            }
        }

        return solution;
    }
}
