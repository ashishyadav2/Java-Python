import java.util.Arrays;
public class merge {
    public static void main(String[] args) {
        int[] nums1 =  {1,2,3,0,0,0};
        int[] nums2 = {3};
        int m = 3,n = 1;
        merger(nums1,m,nums2,n);
    }
    static void merger(int[] nums1, int m, int[] nums2, int n) {
        int[] finalArr = new int[m+n];
        int i=0,j=0,k=0;
        if(nums1.length==0) {
            System.out.println(Arrays.toString(nums2));
        }
        if(nums2.length==0) {
            System.out.println(Arrays.toString(nums1));
        }
        if(m!=0&&n!=0) {
            while(i<nums1.length&&j<nums2.length&&nums1[i]>0&&nums2[j]>0) {
                if(nums1[i]>nums2[j]) {
                    finalArr[k]=nums2[j];
                    j++;
                }
                else {
                    finalArr[k] = nums1[i];
                    i++;
                }
                k++;
            }
            while(i<nums1.length&&nums1[i]>0) {
                finalArr[k] = nums1[i];
                i++;
                k++;
            }
            while(j<nums2.length&&nums2[j]>0) {
                finalArr[k] = nums2[j];
                j++;
                k++;
            }
            System.out.println(Arrays.toString(finalArr));
        }
    }
}
