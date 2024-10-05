package Temp.StringsPractice;

import java.util.Arrays;

public class HighestCharacterCount {
    public static void main(String[] args) {
        String s1 = "abcdefghij google microsoft";
        String[] sarr = s1.split(" ");
        int gmax = 0;
        String ans = "";
        for(String word: sarr){
            int lmax = 0;
            int[] freq = new int[26];
            for(int i=0;i<word.length();i++){
                freq[word.codePointAt(i)-97] += 1;
                lmax = Math.max(freq[word.codePointAt(i)-97], lmax );
            }
            if(lmax>gmax){
                gmax = lmax;
                ans = word;
            }
        }
        System.out.println(ans);
    }
}
