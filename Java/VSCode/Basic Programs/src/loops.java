import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1;i<=num;i++) {
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        while(i<=num) {
            System.out.println(i);
            i++;
        }
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i<=num);

    }
}
