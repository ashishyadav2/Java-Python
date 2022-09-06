import java.util.Arrays;
public class arrayRankTransform {
    public static void main(String[] args) {
        int [] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransformm(arr)));
    }
    static int[] arrayRankTransformm(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            int count =1;
            for(int j =0;j<nums.length;j++) {
                if(nums[i]>nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
