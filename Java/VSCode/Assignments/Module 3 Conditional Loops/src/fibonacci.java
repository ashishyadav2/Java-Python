import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        fibo(num);
    }
    static void fibo(int num) {
        int a =0;
        int b= 1;
        int temp;
        for(int i=0;i<num;i++) {
            temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);
        }
    }
}
