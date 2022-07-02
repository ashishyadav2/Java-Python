public class pattern17 {
    public static void main(String[] args) {
        pattern17(4);
    }
    static void pattern17(int n) {
        for (int row = 1; row < 2*n; row++) {
            int totalCols = row>n ? 2*n-row : row;
            for (int i = 0; i < n-totalCols; i++) {
                System.out.print(" ");
            }
            for (int col = totalCols; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalCols; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
