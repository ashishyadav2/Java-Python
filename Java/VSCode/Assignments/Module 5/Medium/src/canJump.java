public class canJump {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(isJumpPossible(nums));
    }
    static boolean isJumpPossible(int[] nums){
        for(int i=0;i<nums.length;i++) {
            if((i+nums[i])==nums.length-1) {
                return true;
            }
        }
        return false;
    }
}
