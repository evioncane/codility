package lesson7;

import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
        int[] A = {2,3,1,4};
        int[] B = {1,1,0,0};
        System.out.printf("The number of fish remaining: %d", fish.solution(A, B));
    }

    public int solution(int[] A, int[] B) {
        if (A.length == 0) {
            return 0;
        }
        Stack<FishPojo> fishStack = new Stack<>();
        fishStack.push(new FishPojo(B[0], A[0]));

        for (int i = 1; i < A.length; i++) {
            if (B[i] == 0 && fishStack.peek().getDirection() == 1) {
                int initialStackSize = fishStack.size();
                for (int j = 0; j < initialStackSize; j++) {
                    FishPojo fish = fishStack.peek();
                    if (fish.getDirection() == 1 && B[i] == 0) {
                        if (A[i] > fish.getWeight()) {
                            fishStack.pop();
                            if (fishStack.isEmpty()) {
                                fishStack.push(new FishPojo(B[i], A[i]));
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        fishStack.push(new FishPojo(B[i], A[i]));
                        break;
                    }
                }
            } else {
                fishStack.push(new FishPojo(B[i], A[i]));
            }
        }
        return fishStack.size();
    }
}

class FishPojo {
    private final int direction;
    private final int weight;

    public FishPojo(int direction, int weight) {
        this.direction = direction;
        this.weight = weight;
    }

    public int getDirection() {
        return direction;
    }

    public int getWeight() {
        return weight;
    }
}
