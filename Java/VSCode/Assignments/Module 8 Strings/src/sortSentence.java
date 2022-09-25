import java.util.*;
public class sortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(stringg(s));
    }
    static String stringg(String s) {   
        StringBuilder str1 = new StringBuilder();
        String[] str2 =  s.split(" ");
        String[] str3 = new String[str2.length];
        for(int i=0;i<str2.length;i++) {
            String str4 = str2[i];
            int n = str4.length();
            int pos = str4.charAt(n-1)-'0'-1;
            str3[pos] = str4.substring(0,n-1);
        }
        for(int i =0;i<str2.length;i++) {
            str1.append(str3[i]);
            str1.append(" ");
        }
        str1.setLength(str1.length()-1);
        return str1.toString();
    }
}
