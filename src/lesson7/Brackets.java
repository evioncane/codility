package lesson7;

import java.util.EmptyStackException;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        String S = "{{{{";
        System.out.printf("Result is: %d", brackets.solution(S));
    }

    public int solution(String S) {
        Stack<Character> bracesStack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            Character currentCharacter = S.charAt(i);
            if (currentCharacter.equals('{') || currentCharacter.equals('[') || currentCharacter.equals('(')) {
                bracesStack.push(currentCharacter);
            } else {
                try {
                    Character lastCharacter = bracesStack.pop();
                    if ((currentCharacter.equals('}') && !lastCharacter.equals('{'))
                            || (currentCharacter.equals(']') && !lastCharacter.equals('['))
                            || (currentCharacter.equals(')') && !lastCharacter.equals('('))) {
                        return 0;
                    }
                } catch (EmptyStackException e) {
                    return 0;
                }
            }
        }
        if (!bracesStack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
