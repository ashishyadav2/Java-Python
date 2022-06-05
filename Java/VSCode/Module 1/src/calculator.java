import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans  = 0;
        while (true) {
            char opr = input.next().trim().charAt(0);
            if(opr=='+'|| opr=='-' || opr=='*' || opr=='/' || opr=='%') {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(opr == '+') {
                    ans =  num1+num2;
                }
                if(opr == '-') {
                    ans =  num1-num2;
                }
                if(opr == '*') {
                    ans =  num1*num2;
                }
                if(opr == '/') {
                    if(num2!=0) {
                        ans =  num1/num2;
                    }
                }
                if(opr == '%') {
                    ans =  num1%num2;
                }
            }
            else if(opr=='x'||opr=='X') {
                break;
            }
            else {
                System.out.println("Not a valid operator");
            }
            System.out.println(ans);
        }
    }
}
