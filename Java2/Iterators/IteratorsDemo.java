package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(26);
        list.add(29);
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
