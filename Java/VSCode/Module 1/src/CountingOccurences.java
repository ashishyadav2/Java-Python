import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = input.nextInt();
        int rem,count=0;
        while(n>0) {
            rem = n % 10;
            if(rem == num) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
