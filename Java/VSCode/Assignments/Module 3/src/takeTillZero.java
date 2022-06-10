import java.util.Scanner;

public class takeTillZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        int sum=0,n=1;
        while(n!=0) {
           n = input.nextInt();
           sum += n;
        }
        System.out.println(sum);
    }
}
