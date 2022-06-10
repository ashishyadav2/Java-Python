import java.util.Scanner;

public class sumProd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        sumProduct(num);
    }
    static void sumProduct(int num) {
        int sum=0;
        int prod=1;
        while(num>0) {
            int rem = num%10;
            num = num /10;
            sum += rem;
            prod *= rem;
        }
        System.out.println(sum);
        System.out.println(prod);
    }
}
