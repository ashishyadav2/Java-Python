package OOPs.BasicOOPs;

public class StaticPublicMethods {
    public static void staticMethod() {
        System.out.println("Static Method");
    }
    public void publicMethod() {
        System.out.println("Public method");
    }
    public static void main(String[] args) {
        StaticPublicMethods obj1 = new StaticPublicMethods();
        obj1.publicMethod();
        StaticPublicMethods.staticMethod();
        staticMethod();
    }
}
