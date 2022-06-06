import java.util.Scanner;

public class ColNoFixed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
