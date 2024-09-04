package OOPs.Interface;

public class Implementation implements CustomInterface{
    public void method1() {
        System.out.println("Implemented method1");
    }
    public int method2(){
        return 2*2;
    }
    public String method3(int num){
        return Integer.toString(num,10);
    }
    public static void main(String[] args) {
        Implementation obj1 = new Implementation();
        obj1.method1();
        System.out.println(obj1.method2());
        System.out.println(obj1.method3(23));
        System.out.println(obj1.var);
        System.out.println(CustomInterface.var);
        System.out.println(Implementation.var);
    }
}
