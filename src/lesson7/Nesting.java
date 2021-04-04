package lesson7;

public class Nesting {
    public static void main(String[] args) {
        Nesting nesting = new Nesting();
        String S = ")))(((((((";
        System.out.printf("Result: %d", nesting.solution(S));
        System.out.println();
    }

    public int solution(String S) {
        int bracketStack = 0;
        for (int i = 0; i < S.length(); i++) {
            char currentCharacter = S.charAt(i);
            if (currentCharacter == '(') {
                bracketStack++;
            } else {
                bracketStack--;
                if (bracketStack < 0) {
                    return 0;
                }
            }
        }
        return bracketStack == 0 ? 1 : 0;
    }
}
