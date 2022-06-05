import java.util.Scanner;

public class sumX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        while(true) {
            System.out.print("Enter strings: ");
            char ch = input.next().trim().charAt(0);
            if(ch=='x'||ch=='X') {
                System.out.println("Exiting");
                break;
            }
            sum += ch;
            System.out.println(sum);
    }
}
}