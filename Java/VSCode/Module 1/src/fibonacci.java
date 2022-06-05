import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a=0;
        int b=1;
        int result;
    //     for(int i=2;i<=num;i++) {
    //         result = a+b;
    //         a=b;
    //         b=result;
    //         System.out.println(result);
    //     }
    int i = 2;
    int prev = 0;
    int curr = 1;
    while(i<=num) {
        int temp = curr;
        curr =  prev + curr;
        prev = temp;
        i++;
        System.out.println(curr);
    }
    }
}
