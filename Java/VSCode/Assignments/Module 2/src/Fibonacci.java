import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        fibonacciS(num);
    }
    static void fibonacciS(int num) {
        int a= 0;
        int b = 1;
        for(int i = 2;i<=num;i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);
        }
    }
}