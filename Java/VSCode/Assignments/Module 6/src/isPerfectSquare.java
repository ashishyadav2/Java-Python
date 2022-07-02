public class isPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println((isPSqr(num)));
    }
    static boolean isPSqr(int num) {
        int sqrt = (int)Math.sqrt(num);
        if((sqrt*sqrt)==num) {
            return true;
        }
        return false;
    }
}
