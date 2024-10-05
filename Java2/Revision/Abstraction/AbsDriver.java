package Revision.Abstraction;

class Demo extends AbsCls {
    @Override
    String formatString(String text) {
        return text.substring(0,1).toUpperCase()+text.substring(1).toLowerCase();
    }

    @Override
    void greeting(String name) {
        System.out.println("Hello "+name);
    }
}
public class AbsDriver{
    public static void main(String[] args) {
        Demo dm = new Demo();
        System.out.println(dm.formatString("HELLO WORLD"));
        dm.greeting("Ashish");
        System.out.println(dm.sqrt(52));
    }
}
