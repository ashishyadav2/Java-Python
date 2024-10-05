package Revision.Encapsulation;

public class Emp {
    private String name;
    private int age;
    private Addr address;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Addr getAddress() {
        return address;
    }

    public void setAddress(Addr address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
