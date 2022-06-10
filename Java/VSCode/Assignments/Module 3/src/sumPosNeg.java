import java.util.Scanner;

public class sumPosNeg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= 1;
        int neg=0,odd=0,even=0;
        while(num!=0) {
            num = input.nextInt();
            if(num<0) {
                neg += num;
            }
            else {
                if(num%2==0) {
                    even += num;
                }
                else {
                    odd += num;
                }
            }
        }
        System.out.println(neg);
        System.out.println(even);
        System.out.println(odd);
    }
}

