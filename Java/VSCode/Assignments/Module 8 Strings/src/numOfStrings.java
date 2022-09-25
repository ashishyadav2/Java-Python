import java.util.*;
public class numOfStrings {
    public static void main(String[] args) {
        String pattern = "dsgwadsgz";
        String text = "adsgwadsxdsgwadsgz";
        int patLen = pattern.length();
        int[] table = new int[patLen];
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStringss(patterns,word));
        // kmp(text,pattern,table);
    }
    static int numOfStringss(String[] patterns, String word) {
        int count = 0;
        for(int i=0;i<patterns.length;i++) {
            int[] table = new int[patterns[i].length()];
            count += kmp(word,patterns[i],table);
        }
        return count;
    }
    static void prefix(String pattern,int patLen,int[] table) {
        int i=0;
        int j=1;
        table[0]=0;
        while(j<patLen) {
            if(pattern.charAt(i)==pattern.charAt(j)) {
                i++;
                table[j] = i;
                j++;
            }
            else {
                if(i!=0) {
                    i = table[i-1];
                }
                else {
                    table[j] = i;
                    j++;
                }
            }
        }
    }
    static int kmp(String text,String pattern,int[] table) {
        int texLen = text.length();
        int patLen = pattern.length();
        int i=0,j=0,count=0;
        prefix(pattern,patLen,table);
        while((texLen-i)>=(patLen-j)) {
            if(text.charAt(i)==pattern.charAt(j)) {
                i++;
                j++;
            }
            if(j==patLen) {
                j=table[j-1];
                return 1;
            }
            else if(i<texLen&&text.charAt(i)!=pattern.charAt(j)) {
                if(j!=0) {
                    j = table[j-1];
                }
                else {
                    i++;
                }
            }
        }
        return 0;
    }
}
