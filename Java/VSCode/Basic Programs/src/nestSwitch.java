import java.util.Scanner;

public class nestSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String emp = input.next();
        switch(empID) {
            case 1:
                System.out.println("Employee 1");
            break;
            case 2:
                System.out.println("Employee 2");
            break;
            case 3:
                switch(emp) {
                    case "IT":
                        System.out.println("IT dept");
                    break;
                    case "CS":
                        System.out.println("CS dept");
                    break;
                    default:
                        System.out.println("Invalid dept");
                    break;
                }
            break;
            default:
                System.out.println("Invalid Id");
            break;
        }
    }
}
