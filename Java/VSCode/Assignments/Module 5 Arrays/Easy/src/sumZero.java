import java.util.Arrays;

public class sumZero {
    public static void main(String[] args) {
        int n = 7;
        int[] ans = sum(n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int n) {
        int num = n/2;
        int[] result = new int[n];
        if(n%2==0) {
            System.out.println("hellow");
            for(int i=n-1;i>=0;i--) {
                int j = i-num;
                result[i] = j;
            }
            if(result[num]==0) {
                result[num] = num;
            }
            return result;
        }
        for(int i=n-1;i>=0;i--) {
            int j = i-num;
            result[i] = j;
        }
        return result;
    }
}
