import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String answer = oddeven(num);
        System.out.println(answer);
    }
    static String oddeven(int num) {
        if(num%2==0) {
            return "Even";
        }
        return "Odd";
    }
}