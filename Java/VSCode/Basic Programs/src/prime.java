import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        int count = 2;
        while(count*count<=n) {
            if(n%count==0) {
                return false;
            }
            count++;
        }
        if(count*count>n) {
            return true;
        }
        return false;
    }
}
