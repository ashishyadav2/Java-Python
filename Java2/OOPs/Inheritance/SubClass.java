package OOPs.Inheritance;

public class SubClass extends SuperClass{
    protected void calcChildId(int num){
        super.childId = num + 69;
    }
    public static void main(String[] args) {
        SubClass obj1 = new SubClass();

        obj1.setSerialId(1234);
        System.out.println(obj1);

        int temp = obj1.getSerialId();

        obj1.calcChildId(temp);
        System.out.println(obj1);

    }
}
