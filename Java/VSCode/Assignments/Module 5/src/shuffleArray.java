import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums)));
    }
    static int[] shuffle(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length/2;
        for(int i=0;i<n;i++) {
            ans[i*2] = nums[i];
        }
        for(int i=1;i<n+1;i++) {
            ans[i*2-1] = nums[n+i-1];
        }
        return ans;
    }
}
