import java.util.List;
import java.util.ArrayList;
public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findNum(nums));
    }
    static List<Integer> findNum(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int i=0;
        while(i<nums.length) {
            if(nums[i]!=nums[nums[i]-1]) {
                swap(nums,i,nums[i]-1);
            }
            else {
                i++;
            }
        } 
        for(int j=0;j<nums.length;j++) {
            if(j+1!=nums[j]) {
                list.add(j+1);
            }
        }
        return list;  
    }
    static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
