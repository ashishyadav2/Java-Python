import java.util.Arrays;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] arr = {12,1,12};
        int extraCandies = 10;
        System.out.println(Arrays.toString(greatestCandies(arr,extraCandies)));
    }
    static boolean[] greatestCandies(int[] arr,int extraCandies) {
        boolean[] result = new boolean[arr.length];
        for(int i=0;i<arr.length;i++) {
            arr[i] += extraCandies;
            if(isMax(arr[i],arr)) {
                result[i] = true;
            }
            else {
                result[i] = false;
            }
            arr[i] -= extraCandies;
        }
        return result;
    }
    static boolean isMax(int num,int[] arr) {
        int maxNum = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>maxNum) {
                maxNum = arr[i];
            }
        }
        if(maxNum == num) {
            return true;
        }
        else {
            return false;
        }
    }
}
