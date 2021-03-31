package lesson4;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        int[] A = {4,3,1,2};
        int result = permCheck.solution(A);
        if (result == 1) {
            System.out.println("Is premutation");
        } else if (result == 0) {
            System.out.println("Is not premutation");
        } else {
            System.out.println("You done fucked up");
        }
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[0] != 1) {
            return 0;
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1] + 1) {
                return 0;
            }
        }
        return 1;
    }
}
