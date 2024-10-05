package Temp;

import java.util.Arrays;

public class JavaStrings {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return false;
    }
    public static String reverseString(StringBuilder str){
        int i = 0;
        int j = str.length() - 1;
        while(i<=j) {
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,str.charAt(i));
            i++;
            j--;
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String str = "ashish";
        StringBuilder sb = new StringBuilder("stringbuilder");
        System.out.println(str.codePointCount(0,4));
        System.out.println(str.contains("as"));
        System.out.println(str.intern());
        System.out.println(str.substring(1,4));
        System.out.println(String.valueOf(50));
        System.out.println(String.join(",",str));
        System.out.println("----------------------------");
        System.out.println(sb.codePointAt(0));
//        System.out.println(sb.appendCodePoint(116));
        System.out.println(sb.capacity());
        sb.setCharAt(0,'A');
        sb.setLength(6);
        System.out.println(sb);
        System.out.println(isPalindrome(str));
        System.out.println(reverseString(new StringBuilder("random")));
    }
}
