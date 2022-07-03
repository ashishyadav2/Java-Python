import java.util.Arrays;

public class findMissingNum {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(find(arr));
    }
    static int find(int[] arr) {
        int i =0;
        while(i<arr.length) {
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]]) {
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }   
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j) {
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
