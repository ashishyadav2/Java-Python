import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(product(nums)));
    }
    static int[] product(int[] nums){
        int zeroCount = 0;
        int product = 1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                zeroCount++;
                continue;
            }
            product *= nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            if(zeroCount>1) {
                nums[i]=0;
            }
            else if(nums[i]==0) {
                nums[i] = product;
            }
            else if(zeroCount==1) {
                nums[i]=0;
            }
            else {
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }
}
