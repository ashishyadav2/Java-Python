import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for(int i = num1; i<= num2;i++) {
           if(isArmstrong(i)) {
               System.out.println(i);
           }
        }
    }
    static boolean isArmstrong(int num) {
        int ans =0 ;
        int temp = num;
        while(num>0) {
            int rem = num%10;
            num = num/10;   
            ans = ans + rem*rem*rem;
        }
        if(ans==temp) {
            return true;
        }
        else {
            return false;
        }
    }
}