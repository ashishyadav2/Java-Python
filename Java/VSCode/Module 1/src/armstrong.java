import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        for(int i=100;i<1000;i++) {
            if(isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int num) {
        int ans=0;
        int oldNum = num;
        while(num>0) {
            int rem = num%10;
            num = num/10;
            ans += rem*rem*rem;
        }
        if(ans==oldNum) {
            return true;
        }
        return false;
    }
}
