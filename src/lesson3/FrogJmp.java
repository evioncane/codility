package lesson3;

public class FrogJmp {
    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();
        int X = 80;
        int Y = 80;
        int D = 40;
        System.out.printf("Number of jumps is: %d", frogJmp.solution(X, Y, D));
    }

    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y-X)/D);
    }
}
