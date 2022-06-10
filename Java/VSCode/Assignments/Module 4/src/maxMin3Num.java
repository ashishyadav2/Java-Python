import java.util.Scanner;

public class maxMin3Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println("max "+max(num1,num2,num3));
        System.out.println("min "+min(num1,num2,num3));
    }
    static int max(int num1,int num2,int num3) {
        int max = num1;
        if(max<num2) {
            max = num2;
        }
        if(max<num3) {
            max = num3;
        }
        return max;
    }
    static int min(int num1,int num2,int num3) {
        int min = num1;
        if(min>num2) {
            min = num2;
        }
        if(min>num3) {
            min = num3;
        }
        return min;
    }
}
