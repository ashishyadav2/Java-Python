import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float inr = input.nextInt();
        double usd = inrtousd(inr);
        System.out.println(usd);
    }
    static double inrtousd(float inr) {
        return inr*0.013;
    }
}