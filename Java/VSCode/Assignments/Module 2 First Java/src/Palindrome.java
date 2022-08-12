import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int num = 16461;
        // int temp = num;
        // int ans=0;
        // while(num>0) {
        //     int rem = num%10;
        //     num = num/10;
        //     ans = ans*10 + rem;
        // }
        // if(ans == temp ) {
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }
        String strg = "kayak";
        StringBuilder str = new StringBuilder(strg);
        if(strg.equals(str.reverse().toString())) {
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }
    }
}