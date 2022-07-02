public class pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n) {
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
