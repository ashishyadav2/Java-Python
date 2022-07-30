import java.util.Arrays;

public class minAbsoluteSumDiff {
    public static void main(String[] args) {
        int[] nums1 = {1,10,4,4,2,7};
        int[] nums2 = {9,3,5,1,7,4};
        System.out.println(minAbsoluteSumDifference(nums1, nums2));
    }
    static int minAbsoluteSumDifference(int[] nums1, int[] nums2) {
        int[] differenceArray = new int[nums1.length];
        long sum=0;
        for (int i = 0; i < nums1.length; i++) {
            int difff = Math.abs(nums1[i]-nums2[i]);
            differenceArray[i] = difff;
            sum+=difff;
        }
        if(sum==0) {
            return 0;
        }
        int[] temp = Arrays.copyOf(nums1, nums1.length);
        Arrays.sort(temp);
        long minSum = sum;
        for (int j = 0; j < nums1.length; j++) {
            int start = 0;
            int end = nums1.length-1;
            while(start<=end) {
                int mid = start + (end-start)/2;
                int diff = Math.abs(temp[mid]-nums2[j]);
                long newSum = ((sum - differenceArray[j]) + diff);
                if(newSum<minSum) {
                    minSum = newSum;
                }
                if(nums2[j]<temp[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid +1 ;
                }
            }
        }
        int mod=1000000007;
        return (int)(minSum % mod);
    }
}
