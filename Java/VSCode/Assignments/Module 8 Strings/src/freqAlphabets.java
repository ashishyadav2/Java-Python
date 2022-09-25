import java.util.*;
public class freqAlphabets {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabetss(s));
    }
    static String freqAlphabetss(String s) {
        StringBuilder output = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)=='#') {
                output.append((char) (96+Integer.parseInt(s.substring(i-2,i))));
                i-=2;
            }
            else {
                output.append((char) (96+ (s.charAt(i)-'0')));
            }
        }
        return output.reverse().toString();
    }
}
