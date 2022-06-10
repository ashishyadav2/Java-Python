import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean ans = factors(num);
        System.out.println(ans);
    }
    static boolean factors(int num) {
        int sum = 0;
        int temp = num;
        for(int i=1;i<num;i++) {
            if(num%i==0) {
                sum += i;
            }
        }
        if(sum==temp) {
            return true;
        }
        return false;
    }
}
