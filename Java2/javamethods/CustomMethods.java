package javamethods;

public class CustomMethods {
    static String greeting(String name){
        return "Hello, "+name;
    }
    public static void main(String[] args) {
        String name = "John";
        String greetMessage = greeting(name);
        System.out.println(greetMessage);
    }
}
