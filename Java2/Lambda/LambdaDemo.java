package Lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        FunctionalInterface fintfc1 = (n) -> {
            return "Your number is "+Integer.toString(n);
        };
        FunctionalInterface fintfc2 = (n)->{
            return "Aapka number "+Integer.toString(n*60)+" hai!";
        };
        String res1 = fintfc1.method(50);
        String res2 = fintfc2.method(50);
        System.out.println(res1);
        System.out.println(res2);
    }
}
