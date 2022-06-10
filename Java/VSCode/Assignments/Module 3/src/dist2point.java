import java.util.Scanner;

public class dist2point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y1 = input.nextFloat();
        float y2 = input.nextFloat();
        double dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println(dist);
    }
}
