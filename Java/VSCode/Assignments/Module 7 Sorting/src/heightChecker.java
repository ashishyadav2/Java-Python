import java.util.Arrays;
public class heightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightCheckerr(heights));
    }
    static int heightCheckerr(int[] heights) { 
        int[] tempArr = new int[heights.length];
        for(int i=0;i<tempArr.length;i++) {
            tempArr[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for(int j=0;j<heights.length;j++) {
            if(tempArr[j]!=heights[j]) {
                count++;
            }
        }
        return count;
    }
}