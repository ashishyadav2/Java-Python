import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int max;
        max = num1;
        if(num2>max) {
            max = num2;
        }
        if(num3>max) {
            max = num3;
        } max = num1;
        System.out.println("Max is "+max);
    }
}
