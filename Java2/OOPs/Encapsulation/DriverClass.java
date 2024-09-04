package OOPs.Encapsulation;

public class DriverClass {
    public static void main(String[] args) {
        Person p1 = new Person("Homer",48,"Male");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.setName("July");
        System.out.println(p1);

    }
}
