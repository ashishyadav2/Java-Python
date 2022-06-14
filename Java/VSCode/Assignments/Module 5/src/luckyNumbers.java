public class luckyNumbers {
    public static void main(String[] args) {
        int[][] matrix =  {{3,7,8},{9,11,13},{15,16,17}};
        int luckyNum = isLuckyNum(matrix);
        System.out.println(luckyNum);
    }   
    static int isLuckyNum(int[][] matrix) {
        int tempMin = 0 ;
        // for(int row =0;row<matrix.length;row++) {
        //     tempMin = min(matrix[row]);
        //     System.out.println(tempMin);
        // }
        int tempMax = max(matrix[0][0],matrix);
        for(int row=0;row<matrix.length;row++) {
            tempMin = min(matrix[row]);
            for(int col=0;col<matrix[row].length;col++) {
                tempMax = max(matrix[col][row], matrix);
                System.out.println(tempMax);
                System.out.println(tempMin);
                if(tempMax==tempMin) {
                    return tempMin;
                }
            }
        }
        // System.out.println("--");
        return -1;
    }
    static int min(int[] rowMatrix) {
        int min = 999;
        for(int i=0;i<rowMatrix.length;i++) {
            if(rowMatrix[i]<min) {
                min = rowMatrix[i];
            }
        }
        return min;
    }
    static int max(int rowMax,int[][] matrix) {
        int max = 0;
        for(int i=0;i<matrix.length;i++) {
            if(rowMax>max) {
                max = rowMax;
            }
        }
        return max;
    }
}
