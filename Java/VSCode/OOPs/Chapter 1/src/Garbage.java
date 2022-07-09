public class Garbage {
    public static void main(String[] args) {
        abc obj;
        for (int index = 0; index < 100000; index++) {
            obj = new abc("random name");
        }
    }
}
class abc {
    String name;
    abc(String name) {
        this.name = name;
    }
    @Override 
    protected void finalize() throws Throwable {
        System.out.println("object destroyed");
    }
}