import java.util.Arrays;
public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    // int count = 0;
    // Integer candidate = null;

    // for (int num : nums) {
    //     if (count == 0) {
    //         candidate = num;
    //     }
    //     count += (num == candidate) ? 1 : -1;
    // }

    // return candidate;
}
