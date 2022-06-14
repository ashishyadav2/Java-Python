import java.lang.reflect.Array;
import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusInc(digits)));
    }
    static int[] plusInc(int[] digits) {
        int num = 0;
        for(int i=0;i<digits.length;i++) {
            num += digits[i]*Math.pow(10, digits.length-1-i);
        }
        num++;
        int[] ans = new int[digits.length];
        for(int i=digits.length-1;i>0;i--) {
            while(num>0) {
                int rem = num%10;
                num = num / 10;
                ans[i--] = rem;
            }
        }
        return ans;
    }
}
