import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        System.out.println(printGrade(marks));
    }
    static String printGrade(int marks) {
            if (isBetween(91,100,marks))
                return "AA";
            else if (isBetween(81,90,marks))
                return "AB";
            else if (isBetween(71,80,marks))
                return "BB";
            else if (isBetween(61,70,marks))
                return "BC";
            else if (isBetween(51,60,marks))
                return "CD";
            else if (isBetween(41,50,marks))
                return "DD";
            else if (isBetween(0,40,marks))
                return "Fail";
            else
                return "invalid marks";
    }
    static boolean isBetween(int lb,int ub,int marks) {
        if(lb <= marks && marks <= ub) {
            return true;
        }
        return false;
    }
}
