package ArrayList;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    private static int random(int start, int end) {
        LocalTime time = LocalTime.now();
        int diff = end - start;
        int range = 0;
        int num = (time.getNano()+time.getSecond())%diff + start;
        return num;
    }
    private static int random(int end) {
        LocalTime time = LocalTime.now();
        int num = (time.getNano()+time.getSecond())%end;
        return num;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(32);
        list.add(15);
        list.add(1,89);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getFirst());
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        for(int i: list){
            System.out.println(i);
        }
        System.out.println("");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(random(15));
        System.out.println(random(10,15));

        ArrayList<String> list1 = new ArrayList<>();
        for(int i=0;i<10;i++) {
            list1.add(Integer.toString(random(50)));
        }
        System.out.println(list1);
    }
}
