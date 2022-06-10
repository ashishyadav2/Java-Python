import java.util.Scanner;

public class revString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String revStr = rev(str);
        System.out.println(revStr);
    }
    static String rev(String str) {
        StringBuilder strg = new StringBuilder(str);
        String strr = strg.reverse().toString();
        return strr;
    }
}
