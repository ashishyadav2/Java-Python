import java.util.Arrays;

public class findErrorNums {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(find(nums)));
    }
    static int[] find(int[] nums){
        int i=0;
        while(i<nums.length) {
            if(nums[i]!=nums[nums[i]-1]) {
                swap(nums, i, nums[i]-1);
            }
            else {
                i++;
            }
        }
        int[] ans = new int[2];
        for(int j=0;j<nums.length;j++) {
            if(j+1!=nums[j]) {
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
    static void swap(int[] nums,int first,int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
