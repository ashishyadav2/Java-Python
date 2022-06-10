import java.util.Scanner;

public class monthEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mon = input.nextInt();
        int count = 0;
        for(int i =1;i<=mon;i++) {
            if(i%2==0) {
                count++;
            }
        }   
        System.out.println(count);
    }
}
