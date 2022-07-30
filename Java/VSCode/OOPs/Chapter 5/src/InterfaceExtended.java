public class InterfaceExtended implements A,B {
    @Override //annotation is interally an interface
    public void fun() {
        System.out.println("I m in fun");
    }
    @Override
    public void greet() {
        System.out.println("I m in greet");
    }
    public static void main(String[] args) {
        // InterfaceExtended obj = new InterfaceExtended();
        A.greet();
    }
}
public interface A {
    void fun();
}
public interface B extends A{
    void greet();
}