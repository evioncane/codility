package lesson5;

public class CountDiv {
    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
        System.out.printf("Numbers divisible: %d", countDiv.solution(0, 0, 11));
    }
    public int solution(int A, int B, int K) {
        int p1 = A/K;
        int p2 = B/K;
        int numbersBetween = p2-p1;
        if (A%K == 0) {
            numbersBetween++;
        }
        return numbersBetween;
    }
}
