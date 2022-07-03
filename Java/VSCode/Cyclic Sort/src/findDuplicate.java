public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        sort(nums);
    }
    static int sort(int[] nums){
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
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j+1) {
                return nums[j];
            }
        }
        return -1;
    }
}
