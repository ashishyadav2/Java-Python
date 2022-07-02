import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {56,2132,56,25,65,5615,456,15};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
