import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean ans = palin(num);
        System.out.println(ans);
    }
    static boolean palin(int num) {
        int temp = num,ans = 0;
        while(num>0) {
            int rem = num%10;
            num = num / 10;
            // Math.log10(num);
            ans = ans*10 + rem;
        }
        return ans==temp;
    }
}
