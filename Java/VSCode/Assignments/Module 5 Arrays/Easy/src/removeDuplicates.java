import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3};
        System.out.println(Arrays.toString(remove(nums)));
    }
    static int[] remove(int[] nums) {
        int j = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return nums;
    }
}
