import java.util.Arrays;

public class revArr {
    public static void main(String[] args) {
        int[] arr = {65,998,605,98,60,2};
        System.out.println(Arrays.toString(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
