import java.lang.annotation.Target;
import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        int[] ans = sum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int[] nums,int target) {
        int[] ans = new int[2];
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]+nums[i+1] == target) {
                return new int[]{i,i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
