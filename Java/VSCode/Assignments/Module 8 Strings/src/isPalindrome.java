public class isPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
    }
    static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilde str = new StringBuilder(s);
        if(s.equals(str.reverse().toString())) {
            return true;
        }
        return false;
    }
}
