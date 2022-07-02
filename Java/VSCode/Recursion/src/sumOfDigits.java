public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(777));
    }
    static int sum(int num) {
        if(num==0) {
            return 0;
        }
        int rem = num % 10;
        return rem + sum(num/10);
    }
}
