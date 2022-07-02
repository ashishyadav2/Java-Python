import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        // list.add(65);
        // list.remove(0);
        // list.set(1,59);
        // list.contains(65);

        for(int i= 0;i<5;i++) {
            list.add(input.nextInt());
        }
        for(int i=0;i<5;i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
