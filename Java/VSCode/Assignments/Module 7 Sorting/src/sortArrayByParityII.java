import java.util.Arrays;
public class sortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int k =0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==0) {
                ans[k] = nums[i];
                k=k+2;
            }
        }
        int j =1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2!=0) {
                ans[j] = nums[i];
                j=j+2;
            }
        }
        return ans;
    }
}
