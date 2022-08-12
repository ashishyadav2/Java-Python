public class specialArray {
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(special(nums));
    }
    static int special(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>nums.length) {
                count++;
            }
        }
        if(count==nums.length) {
            return count;
        }
        return -1;
    }
}
