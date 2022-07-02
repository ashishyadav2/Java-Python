public class firstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(find(nums));
    }
    static int find(int[] nums) {
        for(int i =0;i<nums.length;) {
            if(nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[nums[i]-1]) {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=i+1) {
                return i+1;
            }
        }
        return -1;
    }
}
