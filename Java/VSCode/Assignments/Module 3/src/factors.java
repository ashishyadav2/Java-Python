import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        factor(num);
    }
    static void factor(int num) {
        int i=1;
        while(i!=num) {
            if(num%i==0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println(num);
    }
}
