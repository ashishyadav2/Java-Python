package OOPs.PolyMorphism;

public class Child1 extends BaseClass{
    @Override
    protected void doSomething(){
        super.doSomething();
        System.out.println("In the child 1 class");
    }
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        obj1.doSomething();
        obj2.doSomething();
    }
}
