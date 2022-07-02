import java.util.ArrayList;
import java.util.Arrays;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(find(nums));
    }
    static ArrayList<Integer> find(int[] nums) {
        ArrayList<Integer> List = new ArrayList<>();
        int i=0;
        while(i<nums.length) {
            if(nums[i]!=nums[nums[i]-1]) {
                swap(nums, i, nums[i]-1);
            }
            else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1) {
                List.add(index+1);
            }
        }
        return List;
    }
        
    static void swap(int[] nums,int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
