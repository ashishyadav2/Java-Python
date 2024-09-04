package HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(6);
        set.add(5);
        System.out.println(set.contains(5));
        System.out.println(set);
    }
}
