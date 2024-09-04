package OOPs.Abstraction;

public class Implementation extends AbstractClass{
    protected void method1() {
        System.out.println("Inside implementated class");
    }

    public static void main(String[] args) {
        Implementation obj1 = new Implementation();
        obj1.method1();
        obj1.method2();
    }
}
