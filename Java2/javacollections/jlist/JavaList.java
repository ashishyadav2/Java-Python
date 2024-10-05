package javacollections.jlist;

import java.util.*;

public class JavaList {
    public static void listDemo(){
        List<Integer> list = new ArrayList<Integer>(5);
        System.out.println(list.size());
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(95);

        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(list.size());
        System.out.println();
        list.remove(list.size()-2);
        List<Integer> list2 = new LinkedList<>();
        list2.addAll(list);
        list2.add(26);
        list2.set(0,58);
        list2.clear();
        for(Integer i: list2){
            System.out.println(i);
        }
        System.out.println(list2.contains(580));
        System.out.println();
        List<Integer> list3 = new Vector<>();
        list3.add(69);
        list3.add(58);
        list3.add(0);
        System.out.println("Contains: "+list2.containsAll(list3));
        System.out.println();

        List<Integer> list4 = new Vector<>();
        list3.add(69);
        list3.add(58);
        list3.add(0);

        System.out.println(list3.equals(list4));

        List<Integer> list5 = new Stack<>();
    }
    public static void main(String[] args) {
        listDemo();

    }
}
