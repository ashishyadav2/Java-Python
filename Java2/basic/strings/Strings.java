package basic.strings;

public class Strings {
    public static void main(String[] args) {
        String a = "Ashish";
        String b = "Yadav";

        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.indexOf('s'));
        System.out.println(a+" "+b);
        System.out.println(a.concat(b));

        System.out.println("This is \"Ashish\"");
    }
}
