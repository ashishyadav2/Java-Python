public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,8,3,5,7,1};
        System.out.println(missingNumberr(arr));
    }
    static int missingNumberr(int[] nums) {
        int i=0;
        while(i<nums.length) {
            if(nums[i]<nums.length&&nums[i]!=nums[nums[i]]) {
                swap(nums,i,nums[i]);
            }
            else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j) {
                return j;
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
