import java.util.Scanner;

public class navg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=1;
        float avg =0;
        int count =-1;
        while(num!=0) {
            num = input.nextInt();
            avg += num;
            count++;
        }
        System.out.println(avg/count);
    }
}
