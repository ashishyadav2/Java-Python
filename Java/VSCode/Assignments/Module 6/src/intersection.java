import java.util.ArrayList;
public class intersection {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(inter(nums1, nums2));
    }
    static ArrayList<Integer> inter(int[] nums1,int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i]==nums2[j]) {
                    list.add(nums1[i]);
                }
            }
        }
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==list.get(i+1)) {
                list.remove(i+1);
            }
        }
        return list;
    }
}
