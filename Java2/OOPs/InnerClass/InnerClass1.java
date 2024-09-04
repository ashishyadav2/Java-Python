package OOPs.InnerClass;

class OuterClass {
    int x = 4;
    class InnerClass{
        int y = 5;
    }
}
public class InnerClass1 {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        OuterClass.InnerClass innerObj1 = obj1.new InnerClass();
        System.out.println(obj1.x);
        System.out.println(innerObj1.y);
    }
}
