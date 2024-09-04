package OOPs.InnerClass;
class Outer{
    protected int x = 10;
    protected void method1() {
        System.out.println("Inside outer class");
    }
    static class Inner {
        protected int y = 15;
        protected void method1() {
            System.out.println("Inside inner class");
        }
    }
}
public class InnerClass2 {
    public static void main(String[] args) {
        Outer outerObj1 = new Outer();
//        Outer.Inner innerObj1 = outerObj1.new Inner();
        System.out.println(outerObj1.x);
//        System.out.println(innerObj1.y);
        outerObj1.method1();
//        innerObj1.method1();

        Outer.Inner innerObj2 = new Outer.Inner();
        System.out.println(innerObj2.y);
        innerObj2.method1();
    }
}
