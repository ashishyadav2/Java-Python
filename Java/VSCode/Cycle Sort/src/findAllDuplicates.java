import java.util.ArrayList;

public class findAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        sort(nums);
    }
    static void sort(int[] nums){
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
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j+1) {
                list.add(nums[j]);
            }
        }
        System.out.println(list);
    }
}
