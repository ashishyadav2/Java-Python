package Temp.StringsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountVowelsSpaces {
    public static void main(String[] args) {
        String strr = "India won the cricket match";
        StringBuilder str = new StringBuilder(strr.toLowerCase());
        Character[] vowels = {'a','i','e','o','u'};
        HashSet<Character> set = new HashSet<>(Arrays.asList(vowels));
        int whitespace = 0;
        int vowelsCount = 0;
        int consonants = 0;
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            int ascii = str.codePointAt(i);
            if(set.contains(currChar)) {
                str.deleteCharAt(i);
            }

        }
        System.out.println(vowelsCount);
        System.out.println(consonants);
        System.out.println(whitespace);
        System.out.println(str.toString());

        String string = "123xyz";
        int sum = 0;
        for(int i=0;i<string.length();i++) {
            try{
                sum += Integer.parseInt(String.valueOf(string.charAt(i)));
            }
            catch (NumberFormatException e){
                continue;
//                System.out.println(e);
            }
        }
        System.out.println(sum);

        int[] arr = new int[26];
        String str1 = "the quick brown fox jumps over the lazy dog";
        String a = "a";
        char[] arr2 = new char[26];
        HashMap<Character, Integer> hamp = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==' '){
                continue;
            }
            arr[str1.codePointAt(i)-a.codePointAt(0)]++;
            arr2[str1.codePointAt(i)-a.codePointAt(0)] = str1.charAt(i);
            if(hamp.containsKey(str1.charAt(i))) {
                hamp.put(str1.charAt(i),hamp.get(str1.charAt(i))+1);
            }
            hamp.putIfAbsent(str1.charAt(i),1);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(hamp);
    }
}
