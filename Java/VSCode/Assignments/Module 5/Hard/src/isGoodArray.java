public class isGoodArray {
    public static void main(String[] args) {
        int[] nums = {12,24,48,96,192};
        System.out.println(isGood(nums));
    }
    static boolean isGood(int[] nums) {
        int gcd = nums[0];
        for(int i=0;i<nums.length;i++) {
            gcd = gcd(gcd,nums[i]);
        }
        if(gcd==1) {
            return true;
        }
        return false;
    }
    static int gcd(int n1,int n2) {
        int max = 0;
        if(n1>n2) {
            max = n1;
        }
        else {
            max = n2;
        }
        while(true) {
            if(max%n1==0&&max%n2==0) {
                break;
            }
            ++max;
        }
        return n1*n2/max;
    }
}
