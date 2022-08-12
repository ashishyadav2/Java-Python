import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String greet = greet(name);
        System.out.println(greet);
    }
    static String greet(String name) {
        return "Hello " + name;
    }
}