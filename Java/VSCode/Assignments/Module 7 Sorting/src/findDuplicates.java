import java.util.*;
public class findDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(findDuplicatess(nums));
    }
    static List<Integer> findDuplicatess(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
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
                list.add(nums[j]);
            }
        }
        return list;
    }
}
