import java.util.Arrays;
public class canMakeArithmeticProgression {
    public static void main(String[] args) {
        int [] arr = {-13,-17,-8,-10,-20,2,3,-19,2,-18,-5,7,-12,18,-17,12,-1};
        System.out.println(canMakeArithmeticProgressionn(arr));
    }
    static boolean canMakeArithmeticProgressionn(int[] arr) {
        if(arr.length<=2) {
            return true;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-2;i++) {
            if(arr[i]-arr[i+1]!=arr[i+1]-arr[i+2]) {
                return false;
            }
        }
        return true;
    }
}
