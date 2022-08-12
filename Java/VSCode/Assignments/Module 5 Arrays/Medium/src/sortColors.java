import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        System.out.println(Arrays.toString(sort(nums)));
    }
    static int[] sort(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length-1-i;j++) {
                if(nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}