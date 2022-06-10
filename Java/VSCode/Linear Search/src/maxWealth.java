public class maxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {5,6,7},
            {8,9,10,11,12},
            {13,12,50}
        };
        findMaxWealth(arr);
    }
    static void findMaxWealth(int[][] arr) {
        int max =0;
        for(int row = 0;row<arr.length;row++) {
            int rowSum = 0;
            for(int col=0;col<arr[row].length;col++) {
                rowSum += arr[row][col];
            }
            if(rowSum>max) {
                max = rowSum;
            }
        }
        System.out.println(max);
    }
}
