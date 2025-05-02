import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sting: ");
        String str = sc.nextLine();

        boolean isPalindrome = true;

        int n =str.length();
        for(int i = 0; i<n/2;i++){
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
        {
            System.out.println("it is palindrome");
        }
    }
}
