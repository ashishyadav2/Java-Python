package Revision.Abstraction;

abstract class AbsCls {
    abstract void greeting(String name);

    abstract String formatString(String text);

    protected int sqrt(int num) {
        return  (int) Math.sqrt(num);
    }
}
