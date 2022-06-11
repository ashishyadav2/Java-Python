import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(FunArray(arr)));
    }
    static int[] FunArray(int[] arr) {
        int[] ans = {0,0,0,0,0,0};
        for(int i=0;i<arr.length;i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;
    }
}
