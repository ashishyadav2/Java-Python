import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String str = input.next();
        String str = "kayak";
        System.out.println(isPalindrome(str));
    }
    // static boolean isPalindrome(String str) {
    //     StringBuilder builder = new StringBuilder(str);
    //     if(str.equals(builder.reverse().toString())) {
    //         return true;
    //     }
    //     return false;
    // }
    static boolean isPalindrome(String str) {
        if(str == null || str.length()==0) {
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if(start!=end) {
                return false;
            }
        }
        return true;
    }
}
