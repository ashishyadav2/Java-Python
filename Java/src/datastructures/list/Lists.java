package datastructures.list;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list.add(12);
        list.add(65);
        list.add(24);

        list2.add(34);
        list2.add(70);

        System.out.println(list.get(1));
        list2.addAll(list);
        System.out.println(list2);

        list.set(1,24);
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.toArray());
        System.out.println(list.contains(12));
        list.clear();
    }
}
