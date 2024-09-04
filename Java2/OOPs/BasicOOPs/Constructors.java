package OOPs.BasicOOPs;

public class Constructors {
    public Constructors() {
        System.out.println("Empty Constructor");
    }
    public Constructors(int num){
        System.out.println("Number is "+num);
    }
    public Constructors(String name, int age){
        System.out.printf("Name: %s, Age: %d\n",name,age);
    }
    public double square(int num){
        return Math.pow(num,2.0);
    }
    public static void main(String[] args) {
        Constructors obj1 = new Constructors();
        Constructors obj2 = new Constructors(23);
        Constructors obj3 = new Constructors("John",25);
        double ans = obj3.square(23);
        System.out.println(ans);
    }
}
