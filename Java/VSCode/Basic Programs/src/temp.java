import java.util.Scanner;

// import java.util.Scanner;
public class temp {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in C: ");
        float cel  = input.nextFloat();
        float fahrenheit = (cel * 9/5) +32;
        System.out.println("fahrenheit: " + fahrenheit);
    }
}