import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,8,3,5,7,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i =0;
        while(i<arr.length) {
            if(arr[i]!=arr[arr[i]-1]) {
                int a = i;
                int b = arr[i]-1;
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
            else {
                i++;
            }
        }
    }
}
