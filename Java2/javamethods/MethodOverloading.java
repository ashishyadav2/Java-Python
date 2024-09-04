package javamethods;

public class MethodOverloading {
    static int calc(int a, int b){
        return a+b;
    }
    static float calc(int a,float b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(calc(5,5));
        System.out.println(calc(5,5.2f));
    }
}
