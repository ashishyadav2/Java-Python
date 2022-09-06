import java.util.Arrays;
public class largestNumber {
    public static void main(String[] args) {
        int[] nums = {10,2};
        System.out.println(largestNum(nums));
    }
    private static class LargestNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a,String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        }
    }
    static String largestNum(int[] nums) {
        String[] numsAsStr = new String[nums.length];
        for(int i=0;i<nums.length;i++) {
            numsAsStr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsAsStr, new LargestNumberComparator());
        if(numsAsStr[0].equals("0")) {
            return "0";
        }
        String largestNumStr = new String();
        for(String numStr : numsAsStr) {
            largestNumStr += numStr;
        }
        return largestNumStr;
    }
}
