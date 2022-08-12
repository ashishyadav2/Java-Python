import java.util.Arrays;
public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalArr = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length) {
            if(nums1[i]>nums2[j]) {
                finalArr[k] = nums2[j];
                j++;
            }
            else {
                finalArr[k] = nums1[i];
                i++;
            }
            k++;
        }
        while(i<nums1.length) {
            finalArr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length) {
            finalArr[k]=nums2[j];
            j++;
            k++;
        }
        int mid = (finalArr.length-1)/2;
        if(finalArr.length%2==0) {
            return (double)(finalArr[mid]+finalArr[mid+1])/2;
        }
        return (double)finalArr[mid];
    }
}
