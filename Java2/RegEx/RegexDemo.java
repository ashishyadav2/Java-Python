package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Za-z]+\\d+@[A-Za-z]+.[A-Za-z]+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("email@example.com");
        boolean found = matcher.find();
        if(found) {
            System.out.println("match found");
        }
        else {
            System.out.println("not found");
        }
    }
}
