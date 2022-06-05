import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        int a = input.nextInt();
        int b = input.nextInt();
        if(ch == '+') {
            System.out.println(a+b);
        }
        if(ch == '-') {
            System.out.println(a-b);
        }
        if(ch == '/') {
            System.out.println(a/b);
        }
        if(ch == '*') {
            System.out.println(a*b);
        }
    }
}