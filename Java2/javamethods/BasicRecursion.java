package javamethods;

public class BasicRecursion {
    static int factorial(int num){
        if (num==0){
            return 1;
        }
        return num * factorial(num-1);
    }
    static int fibonacci(int num){
        if (num<=1) {
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
//    static short sum(byte num){
//        if (num<=0) {
//            return (short) (0);
//        }
//        return (short) (num + sum((byte) (num-1)));
//    }
    static int sum(int num){
        if (num<=0){
            return 0;
        }
        return num + sum(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
        System.out.println(fibonacci(15));
//        System.out.println(sum((byte) (10)));
        System.out.println(sum(15));
        int summ = 0;
        for(int i=0;i<15;i++){
            summ+=i;
        }
        System.out.println(summ);
    }
}
