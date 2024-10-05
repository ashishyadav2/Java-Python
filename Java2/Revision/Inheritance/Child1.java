package Revision.Inheritance;

public class Child1 extends Parent{
    @Override
    protected void greeting(String name) {
        System.out.println("Namaste "+name);
    }
}
