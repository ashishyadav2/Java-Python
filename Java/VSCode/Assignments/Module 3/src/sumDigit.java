import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;
        while(num>0) {
            int rem = num%10;
            num = num / 10;
            ans += rem;
        }
        System.out.println(ans);
    }

}
