package javacollections.jset;

import java.util.*;
class Tuple<T,U> {
    T first;
    U second;
    public Tuple(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T first(){
        return this.first;
    }
    public U second(){
        return this.second;
    }
    @Override
    public String toString(){
        return "("+first()+", "+second()+")";
    }
}
class comp implements Comparator<Object> {
    @Override
    public int compare(Object o1,Object o2){
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;
        if(Objects.equals(a, b)) {
            return  0;
        }
        else if(a<b) {
            return 1;
        }
        return -1;
    }
}
public class JavaSet {
    public static void normalSet(){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(52);
        set.add(98);
        set.add(47);
        System.out.println(set.remove(0));
        System.out.println(set.contains(0));
        set.forEach((i)-> System.out.println(i));
    }
    public static void sortedSet(){
        Set<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(50);
        set.add(15);
        set.add(5);
        set.forEach((i)-> System.out.println(i));
    }
    public static void setOperations() {
        Set<Integer> setA = new TreeSet<>(new comp());
        setA.add(0);
        setA.add(2);
        setA.add(4);
        setA.add(6);

        Set<Integer> setB = new HashSet<>();
        setB.add(0);
        setB.add(4);
        setB.add(12);
        setB.add(16);

//        setA.retainAll(setB);
//        System.out.println(setA);
//
        setA.addAll(setB);
        System.out.println(setA);
//
//        setA.removeAll(setB);
//        System.out.println(setA);


    }

    public static void hashMap() {
        Map<Integer,String> hmap = new HashMap<>();
        hmap.put(0,"zero");
        hmap.put(2,"two");
        hmap.put(3,"three");
        hmap.putIfAbsent(1,"One");
        System.out.println(hmap.keySet());
        System.out.println(hmap.values());
        System.out.println(hmap.get(0));
        System.out.println(hmap.containsKey(0));
        System.out.println(hmap.getOrDefault(0,"hello"));
        System.out.println(hmap.getOrDefault(85,"hello"));
        String[] arr = {"a","b","c","d"};
        List<String> l1 = new Vector<>();
        for(Map.Entry<?,?> tuple: hmap.entrySet()){
            System.out.println(tuple);
        }
        Map<String,Integer> hmap2 = new HashMap<>();
        for(String e: arr) {
            hmap2.put(e,e.codePointAt(0)-"a".codePointAt(0));
        }
        hmap2.clear();
        for(int i=0;i<26;i++) {
            int value = "a".codePointAt(0)+i;
            String key = Character.toString((char)(value));
            if (hmap2.putIfAbsent(key,value)!=null) {
                hmap2.replace(key,hmap2.get(key)+1);
            }
        }
        for(int i=0;i<26;i++) {
            int value = "a".codePointAt(0)+i;
            String key = Character.toString((char)(value));
            if (hmap2.putIfAbsent(key,value)!=null) {
                hmap2.replace(key,hmap2.getOrDefault(key,0)+1);
            }
        }
        hmap2.forEach((k,v)-> System.out.printf("%s: %d%n",k,v));

    }
    public static void tuple(){
        List<Tuple<String, Integer>> l1 = new LinkedList<>();
        for(int i=0;i<26;i++) {
            Tuple<String,Integer> t1 = new Tuple<>(Character.toString(i+97), i + 97);
            l1.add(t1);
        }
        for(Tuple<String,Integer> t1: l1){
            System.out.println(t1);
        }

    }
    public static void main(String[] args) {
//        normalSet();
//        sortedSet();
//        setOperations();
//        hashMap();
        tuple();
    }

}
