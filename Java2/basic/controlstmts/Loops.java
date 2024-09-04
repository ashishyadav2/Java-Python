package basic.controlstmts;

public class Loops {
    public static void main(String[] args) {
        int a = 123;
        while (a!=0) {
            int rem = a%10;
            System.out.println(rem);
            a/=10;
        }
        int n = 5;
        for (int i=0;i<10;i++) {
            System.out.println(n+" x "+(i+1)+" = "+ (i+1)*n);
        }
        String[] strArr = {"Car","Dog","Cat","Monkey"};
        for( String i: strArr) {
            System.out.println(i);
        }
    }
}
