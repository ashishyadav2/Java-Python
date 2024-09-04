package basic.controlstmts;

public class ControlStmts {
    public static void main(String[] args) {
        int age = 3;
        if (age>=18) {
            System.out.println("Eligible for voting");
        }
        else if (age==17) {
            System.out.println("Next year");
        }
        else {
            System.out.println("not eligible for voting");
        }
    }
}
