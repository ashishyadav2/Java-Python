import java.util.Scanner;

public class takeTillZeroLar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,num =1,largest = 0;
        while(num!=0) {
            num = input.nextInt();
            largest = Integer.MAX_VALUE;
            if(num>largest) {
                largest = num;
            }
            sum += num;
        }
        System.out.println(sum);
        System.out.println(largest);
    }
}
