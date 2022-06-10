import java.util.Scanner;

public class sumNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(printt(num));
    }
    static int printt(int num) {
        return (num*(num+1))/2;
    }
}
