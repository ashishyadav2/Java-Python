package basic.controlstmts;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 6;
        switch (day) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
