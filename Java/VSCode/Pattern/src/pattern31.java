public class pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern31(int n) {
        int temp = n+1;
        n = n*2;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int atEveryIndex = temp - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
