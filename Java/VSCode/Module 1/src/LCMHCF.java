public class LCMHCF {
    public static void main(String[] args) {
        int num1 = 3 ,num2 = 12;
        int max,gcd;
        if(num1>num2) {
            max = num1;
        }
        else {
            max = num2;
        }
        while(true) {
            if(max%num1==0&&max%num2==0) {
                System.out.println(max);
                break;
            }
            ++max;
        }
        gcd = num1*num2 / max;
        System.out.println(gcd);
    }
}
