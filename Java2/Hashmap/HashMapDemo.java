package Hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(0,"Zero");
        hmap.put(1,"One");
        hmap.put(2,"Two");
        hmap.put(3,"Three");
        hmap.put(4,"Four");
        System.out.println(hmap);
        System.out.println(hmap.get(0));
        hmap.remove(2);
        System.out.println(hmap);
        for(String i: hmap.values()){
            System.out.println(i);
        }
        for(int i: hmap.keySet()) {
            System.out.println(i);
        }
        System.out.println(hmap.entrySet());
        Integer a = 0;
        System.out.println(a.getClass().getName());
        for(int i=0;i<hmap.size();i++){
            if (hmap.containsKey(0)){
                System.out.println("hello");
            }
        }
        hmap.replace(0,"Hello");
        System.out.println(hmap);
    }
}
