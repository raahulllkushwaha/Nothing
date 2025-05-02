public class Swap {
    public static void main(String[] args) {
        int a = 45;
        int b =76;
        System.out.println("Number before swap: " + a + " " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("Number after swap: " + a + " " + b);


    }
}
