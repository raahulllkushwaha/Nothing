package Pattern;

public class rightAngle {
    public static void main(String[] args) {
        rightAngle.rightA(5);
    }

    static void rightA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
