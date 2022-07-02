public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(555));
    }
    static int sum(int num) {
        int rem = num % 10;
        if(rem==num) {
            return num;
        }
        return rem * sum(num/10);
    }
}
