package Revision.Interfaces;

public class Implementation {
    public static void main(String[] args) {
        IntCls obj1 = new IntCls();
        System.out.println(obj1.calcSq(25));
        System.out.println(obj1.calcCu(5));
        FunInt obj2 = (text)-> {
            System.out.println("Hello "+text);
        };
        obj2.sayHello("Ashish");
    }
}
