public class Wrapper {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        // final varialble has to be initialized
        // no reassignment in non primitive datatypes
        final int c = 25;
        System.out.println(c);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
