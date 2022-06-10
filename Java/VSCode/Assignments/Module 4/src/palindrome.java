import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num) {
        int temp = num;
        int ans = 0;
        while(num>0) {
            int rem = num%10;
            num = num / 10;
            ans = ans*10+rem;
        }
        if(temp==ans) {
            return true;
        }
        return false;
    }
}
