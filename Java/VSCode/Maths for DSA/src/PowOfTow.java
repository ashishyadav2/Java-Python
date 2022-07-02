public class PowOfTow {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(ifPow(num));
    }
    static boolean ifPow(int num) {
        return (num&(num-1))==0;
    }
}