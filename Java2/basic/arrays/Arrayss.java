package basic.arrays;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        String[] cars = {"car1","car2","car3"};
        int[] integers = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(integers));

        cars[0] = "Car0";
        integers[0] = 23;
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(integers));

        System.out.println(cars.length);
        System.out.println(integers.length);

        int[][] matrix = {
                {1,2,3},
                {4,5,6,15},
                {7,8,9}
        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j]*=2;
            }
        }
        for (int[] mat: matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}
