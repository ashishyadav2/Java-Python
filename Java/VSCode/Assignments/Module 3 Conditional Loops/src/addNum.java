import java.util.Scanner;

public class addNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = add(a,b);
        System.out.println(sum);
    }
    static int add(int a, int b) {
        return a+b;
    }
}
