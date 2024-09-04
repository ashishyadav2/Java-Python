package basic.variables;

public class Variables {
    public static void main(String[] args) {
        byte var_byte = 3;
        short var_short = 2;
        int var_int = 21;
        long var_long= 200L;
        float var_float = 2.3f;
        double var_double = 5.3d;
        boolean var_boolean  = true;
        String var_string = "String";
        char var_char = 'A';
        final float var_const = 3.14f;


        System.out.println("Byte: "+var_byte);
        System.out.println("Short: "+var_short);
        System.out.println("Integer: "+var_int);
        System.out.println("Long: "+var_long);
        System.out.println("Float: "+var_float);
        System.out.println("Double: "+var_double);
        System.out.println("Boolean: "+var_boolean);
        System.out.println("String: "+var_string);
        System.out.println("Char: "+var_char);
        System.out.println("Const variable: "+var_const);


        int a = 5,b=6,c=7;
        System.out.println(a+" "+b+" "+c);
        a = b = c = 59;
        System.out.println(a+" "+b+" "+c);
    }
}
