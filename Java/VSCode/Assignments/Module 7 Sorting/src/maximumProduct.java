import java.util.Arrays;
public class maximumProduct {
    public static void main(String[] args) {
        // int[] nums =  {-1,-2,-3};
        // int[] nums =  {1,2,3};
        // int[] nums =  {-1,0,100};
        int[] nums =  {-10,-50,1,5};
        System.out.println(maxProduct(nums));
    }
    static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int product = nums[0]*nums[1]*nums[nums.length-1];
        product = Math.max(nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1],product);
        return product;
    }
}
