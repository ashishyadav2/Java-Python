import java.util.Arrays;

public class largestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(gainn(gain));
    }
    static int gainn(int[] gain) {
        int[] result = new int[gain.length+1];
        result[0]=0;
        int max = 0;
        result[1]= gain[0];
        for(int i=2;i<result.length;i++) {
            result[i] = result[i-1] + gain[i-1];
        }
        for(int i=0;i<result.length;i++) {
            if(result[i]>max) {
                max = result[i];
            }
        }
        return max;
    }
}
