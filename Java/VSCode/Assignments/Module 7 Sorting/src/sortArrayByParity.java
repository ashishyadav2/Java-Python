import java.util.Arrays;
public class sortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrays(nums)));
    }
    static int[] sortArrays(int[] nums) {
        int k=0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==0) {
                ans[k] = nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2!=0) {
                ans[k] = nums[i];
                k++;
            }
        }    
        return ans;    
    }
}
