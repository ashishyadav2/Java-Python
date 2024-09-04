package basic.typecasting;

public class TypeCasting {
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

        // Widening (automatic type casting)
        short ans = var_byte;
        System.out.println(ans);

        // Narrowing (manual type casting)
        short ans2 =  (short) (var_byte * var_short);
        System.out.println(ans2);
    }
}
