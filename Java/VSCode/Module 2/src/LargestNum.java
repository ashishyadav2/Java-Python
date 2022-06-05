import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = max(a,b);
        System.out.println(ans);
    }
    static int max(int a, int b) {
        if(a>b) {
            return a;
        }
        return b;
    }
}