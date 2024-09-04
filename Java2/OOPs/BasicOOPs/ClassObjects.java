package OOPs.BasicOOPs;

public class ClassObjects {
    int x = 5;
    final int y = 78;
    public static void main(String[] args) {
        ClassObjects obj1 = new ClassObjects();
        ClassObjects obj2;
        obj2 = obj1;
        System.out.println(obj1.x);
        obj1.x = 9;
        obj2.x= 69;
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj1.y);
        int z = 5;
        System.out.printf("%d, %d, %d",z,z++,++z);
    }
}
