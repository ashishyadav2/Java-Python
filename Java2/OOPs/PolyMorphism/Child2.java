package OOPs.PolyMorphism;

public class Child2 extends BaseClass{
    protected void doSomething() {
        super.doSomething();
        System.out.println("In the child 2 class");
    }
    public static void main(String[] args) {
        Child2 obj1 = new Child2();
        obj1.doSomething();

    }
}
