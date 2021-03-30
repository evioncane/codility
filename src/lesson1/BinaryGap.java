package lesson1;

public class BinaryGap {

    public static void main(String[] args) {
        int n = 20;
        System.out.printf(" Binary Gap of %d is %d", n, binaryGap(n));
    }

    private static int binaryGap(int n) {
        String binaryRepresentation = Integer.toBinaryString(n);

        int maxLength = 0;
        int currentLength = 0;
        boolean onGoingSeq = false;

        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char current = binaryRepresentation.charAt(i);
            if (current == '0') {
                if (!onGoingSeq) {
                    onGoingSeq = true;
                }
                currentLength++;
            }
            else if (onGoingSeq) {
                onGoingSeq = false;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
        }
        return maxLength;
    }

    public int solution(int N) {
        String binaryRepresentation = Integer.toBinaryString(N);

        int maxLength = 0;
        int currentLength = 0;
        boolean onGoingSeq = false;

        for (int i = 0; i < binaryRepresentation.length(); i++) {
            char current = binaryRepresentation.charAt(i);
            if (current == '0') {
                if (!onGoingSeq) {
                    onGoingSeq = true;
                }
                currentLength++;
            }
            else if (onGoingSeq) {
                onGoingSeq = false;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
        }
        return maxLength;
    }
}
