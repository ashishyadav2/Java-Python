package OOPs.Enum;
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
public class enumm {
    public static Level method1(Level l){
        return l;
    }
    public static void main(String[] args) {
        for(Level i: Level.values()){
            System.out.println(i);
        }
        System.out.println(method1(Level.LOW));
    }
}
