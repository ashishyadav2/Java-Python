public class largestPerimeter {
    public static void main(String[] args) {
        
    }
    static int perimeter(int[] nums) {
        Arrays.sort(nums); 
        for(int i=nums.length-3;i>=0;--i) {
            if(nums[i]+nums[i+1]>nums[i+2]) {
                return nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return 0;
    }
}
