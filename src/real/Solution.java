package real;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String S1 = "BAONXXOLL";
        String S2 = "BAOOLLNNOLOLGBAX";
        String S3 = "QAWABAWONL";
        String S4 = "ONLABLABLOON";
        String S5 = "";
        System.out.printf("Result is: %d", solution.solution(S5));
    }

    public int solution(String S) {
        if (S.length() < 7) {
            return 0;
        }
        int countA = 0;
        int countB = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if ( currentChar == 'A') {
                countA++;
            } else if (currentChar == 'B') {
                countB++;
            } else if (currentChar == 'L') {
                countL++;
            } else if (currentChar == 'O') {
                countO++;
            } else if (currentChar == 'N') {
                countN++;
            }
        }
        return checkSmallestCharNumber(countA, countB, countL, countO, countN);
    }

    private int checkSmallestCharNumber (int countA, int countB, int countL, int countO, int countN) {
        int realCountL = countL/2;
        int realCountO = countO/2;
        int min1 = Math.min(countA, countB);
        int min2 = Math.min(realCountO, realCountL);
        int min3 = Math.min(min1, countN);
        return Math.min(min2, min3);
    }

}
