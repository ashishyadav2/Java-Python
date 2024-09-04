package basic.operators;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operators
        int a = 5;
        int b = 8;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a++);
        System.out.println(b--);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println("-------------------------------------------");

        //Assignment operators
        int c = 7;
        int d = 6;
        System.out.println(c+=d);
        System.out.println(c-=d);
        System.out.println(c/=d);
        System.out.println(c%=d);
        System.out.println(c&=d);
        System.out.println(c|=d);
        System.out.println(c^=d);
        System.out.println(c>>=d);
        System.out.println(c<<=d);

        //Comparison operators
        int e = 5;
        int f = 6;
        System.out.println(e==f);
        System.out.println(e<=f);
        System.out.println(e>=f);
        System.out.println(e!=f);
        System.out.println(e<f);
        System.out.println(e>f);
        System.out.println("-------------------------------------------");

        //Logical operators
        int g = 6;
        int h = 7;
        System.out.println(g<9 && h>8);
        System.out.println(g<9 || h>8);
        System.out.println("-------------------------------------------");

        //Bitwise operators
        int i = 101;
        int j = 11;
        System.out.println(i&j);
        System.out.println(i|j);
        System.out.println(i^j);
        System.out.println("-------------------------------------------");
    }
}
