package Revision.Encapsulation;

public class DriverCls {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setName("Ashish");
        e1.setAge(21);
        Addr address = new Addr(702,"Mumbai");
        e1.setAddress(address);
        System.out.println(e1);
    }

}
