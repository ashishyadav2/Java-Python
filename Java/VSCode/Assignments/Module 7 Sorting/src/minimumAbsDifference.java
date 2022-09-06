import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class minimumAbsDifference {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,15};
        // for(int i=0;i<arr.length;i++) {
        //     System.out.println(minimumAbsDifferences(arr));
        // }        
        System.out.println(tempFunc(arr));
    }
    static void quickSort(int[] arr,int low ,int high) {
        if(low>=high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start<=end) {
            while(arr[start]<pivot) {
                start++;
            }
            while(arr[end]>pivot) {
                end--;
            }
            if(start<=end) {
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
    static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static ArrayList<Integer> tempFunc(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int min = 999;
        int currMin = 0;
        for(int i=0;i<arr.length-1;i++) {
            currMin = Math.abs(arr[i]-arr[i+1]);
            if(min>=currMin) {
                list.add(arr[i]);
                if(arr[i]!=arr[i+1]) {
                    list.add(arr[i+1]);
                }
                min = currMin;
            }
        }
        return list;
    }
}
