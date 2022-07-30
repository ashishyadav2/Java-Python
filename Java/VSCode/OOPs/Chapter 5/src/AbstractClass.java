public class AbstractClass {
    public static void main(String[] args) {
        Son son = new Son();
        son.career("Programmer");
        son.interest("Coding");
    }
}
abstract class Parent {
    int age=19;
    abstract void career(String name);
    abstract void  interest(String interst);
}
class Son extends Parent {
    Son() {
        System.out.println(age);
    }
    Son(int age) {
        this.age = age;
        System.out.println(age);
    }
    void career(String name) {
        System.out.println("I want to become "+ name);
    }
    void interest(String interst) {
        System.out.println("I have interest in "+ interst);
    }
}