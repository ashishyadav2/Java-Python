import java.lang.reflect.Array;
import java.util.Arrays;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(find(nums));
    }
    static int find(int[] nums) {
        int i=0;
        while(i<nums.length) {
            if(nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[nums[i]-1]) {
                swap(nums,i,nums[i]-1);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j+1) {
                return j+1;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums,int a,int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}