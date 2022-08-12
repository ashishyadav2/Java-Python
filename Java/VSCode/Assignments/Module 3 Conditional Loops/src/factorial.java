import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(fact(num));
    }
    static int fact (int num) {
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
}