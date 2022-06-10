import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int num) {
        int i=2;
        while(i<num) {
            if(num%i==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
