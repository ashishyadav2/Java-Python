import java.util.Arrays;

public class swapArr {
    public static void main(String[] args) {
        int[] arr = {56,23,30,78,45};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
