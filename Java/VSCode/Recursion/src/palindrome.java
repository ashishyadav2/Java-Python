public class palindrome {
    static boolean isPalindrome(int num) {
        if(num==rev(num)) {
            return true;
        }
        return false;
    }
    static int rev(int num) {
        int digits = (int)Math.log10(num)+1;
        return helper(num, digits);
    }
    static int helper(int num,int digits) {
        if(num==0) {
            return 0;
        }
        int rem = num%10;
        return rem*(int)Math.pow(10, digits-1) + helper(num/10, digits-1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}