package Pattern;

public class AdvPattern {
    public static void main(String[] args) {
        int n = 4;
        //first part
        for (int i = 1; i <= n; i++) {
            int spaces = 2 * (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second part
        for (int i = n; i >= 1; i--) {
            int spaces = 2 * (n - i);

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = spaces; j >= 1; j--) {

                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
