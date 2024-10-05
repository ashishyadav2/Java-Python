package Temp.StringsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomCompartor {
    public static void main(String[] args) {
        String str = "ashish";
        ArrayList<Character> list = new ArrayList<>();
        for(char c: str.toCharArray() ){
            list.add(c);
        }
        list.sort((a,b)->Character.compare(a,b));
        System.out.println(list);

        String s1 = "the quick brown box jumps over the lazy dog";
        StringBuilder s2= new StringBuilder(s1);
        s2 = new StringBuilder(s2.toString().replaceAll("i",""));
        System.out.println(s1);
        System.out.println(s2.toString());

    }
}
