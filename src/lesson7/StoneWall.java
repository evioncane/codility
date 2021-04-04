package lesson7;

import java.util.Stack;

public class StoneWall {
    public static void main(String[] args) {
        StoneWall stoneWall = new StoneWall();
        int[] H = {8,8,5,7,9,8,7,4,8};
        System.out.printf("Result: %d", stoneWall.solution(H));
    }

    public int solution(int[] H) {

        Stack<Integer> st = new Stack<>();
        int numBlock =0;

        for(int i = 0; i < H.length; i++) {
            while(!st.isEmpty() && st.peek() > H[i]) {
                st.pop();
            }

            if (st.isEmpty() || st.peek() < H[i]) {
                st.push(H[i]);
                numBlock++;
            }
        }

        return numBlock;
    }
}
