import java.util.Scanner;

public class hcfLcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        lcm(num1,num2);
    }
    static void lcm(int num1,int num2) {
        int max;
        if(num1>num2) {
            max = num1;
        }
        else {
            max = num2;
        }
        while(true) {
            if(max%num1==0&&max%num2==0) {
                System.out.println(max);
                break;
            }
            ++max;
        }
        int hcf = num1*num2/max;
        System.out.println(hcf);
    }
}
