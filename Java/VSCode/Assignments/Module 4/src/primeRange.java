import java.util.Scanner;

public class primeRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        for(int i=start;i<=end;i++) {
            if(prime(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean prime(int num) {
        int i = 2;
        while(i<num) {
            if(num%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
