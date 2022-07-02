import java.util.Arrays;

public class ArrayConCat {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(arrConcat(nums)));
    }
    static int[] arrConcat(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i = 0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }   
        return ans;
    }
}
