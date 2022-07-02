public class pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalCols = row>n ? 2*n - row : row;
            for(int noSpcs=0;noSpcs<n-totalCols;noSpcs++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
