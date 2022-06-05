import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        double t = input.nextDouble();
        double r = input.nextDouble();
        double ans = simple(p,r,t);
        System.out.println(ans);
    }
    static double simple(int p, double r,double t) {
        return p+(p*t*r) / 100;
    }
}