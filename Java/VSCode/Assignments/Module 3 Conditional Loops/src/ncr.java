import java.util.Scanner;

public class ncr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);
    }
    static int fact(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++) {
            fact *= i;
        }
        return fact;
    }
}
