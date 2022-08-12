import java.util.ArrayList;
public class countSmaller {
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        System.out.println(count(nums));
    }
    static ArrayList<Integer> count(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(i==nums.length-1) {
                list.add(0);
                return list;
            }
            int count = 0;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]>nums[j]) {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
}
