import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {0,0,3,4};
        int target = 0;
        int[] ans = sum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int[] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(i==j) {
                    continue;
                }
                if(arr[i]+arr[j]==target) {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
