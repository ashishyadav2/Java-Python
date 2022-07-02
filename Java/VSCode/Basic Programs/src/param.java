import java.util.Scanner;

public class param {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String messeage = input.next();
        String msg = strgreet(messeage);
        System.out.println(msg);
    }
    static String strgreet(String name) {
        String mesg = "Hello "+ name;
        return mesg;
    }
}
