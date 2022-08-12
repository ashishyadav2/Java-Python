import java.util.Scanner;

public class pythagorasTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(isTriplet(num1,num2,num3));
    }
    static boolean isTriplet(int num1,int num2,int num3) {
        double ans = Math.sqrt(Math.pow(num1, 2)+Math.pow(num2, 2));
        if(ans == num3) {
            return true;
        }
        return false;
    }
}
