package temporary;

import java.util.Arrays;

public class ChocolateFactory {
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        int len = arr.length;
        int count = 0;
        for(int i=0;i<len;i++) {
            if(arr[i]!=0) {
                arr[count++] = arr[i];
            }
        }
        for(int i=count;i<len;i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
