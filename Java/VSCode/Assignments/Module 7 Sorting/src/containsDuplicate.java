import java.util.Arrays;
public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums =  {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length) {
            if(nums[i]!=nums[nums[i]-1]) {
                int a = i;
                int b = nums[i]-1;
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length-1;j++) {
            if(nums[j]==nums[j+1]) {
                return true;
            }
        }
        return false;
    }
}
