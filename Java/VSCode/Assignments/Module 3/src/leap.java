import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean ans = leapp(year);
        System.out.println(ans);
    }
    static boolean leapp(int year) {
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    return true;
                }
                else {
                    return false;   
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
