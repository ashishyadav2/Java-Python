import java.lang.reflect.Array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a ;
        a = new int[5];
        a[0] = 986;
        a[1] = 655;
        a[2] = 481;
        a[3] = 156;
        a[4] = 961;
        for(int i=0;i<a.length;i++) {
            a[i] = input.nextInt();
        }
        for(int j:a) {
            System.out.println(j);
        }
        System.out.println(Arrays.toString(a));
    }
}