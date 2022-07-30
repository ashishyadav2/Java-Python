public class AccessModifiers {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.setNum(5);
        System.out.println(obj.num);
        System.out.println(obj.name);
    }   
}
class ABC {
    private int num;
    // to set private variabales use getNum and setNum
    String name;
    int[] arr;
    public int getNum(int num) {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    // ABC(int num,String name) {
    //     this.num = num;
    //     this.name = name;
    //     this.arr = new int[num];
    // }
}