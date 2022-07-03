import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        // System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInplace(arr, 0, arr.length);  
        System.out.println(Arrays.toString(arr));      
    }
    //merge sort recursion
    static int[] mergeSort(int[] arr) {
        if(arr.length==1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));    
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right) {
        int[] finalArr = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length) {
            if(left[i]>right[j]) {
                finalArr[k] = right[j];
                j++;
            }
            else {
                finalArr[k] = left[i];
                i++;
            }
            k++;
        }
        while(i<left.length) {
            finalArr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length) {
            finalArr[k] = right[j];
            j++;
            k++;
        }
        return finalArr;
    }
    //Mergesort in place
    static void mergeSortInplace(int[] arr,int start,int end) {
        if(end-start == 1){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);
        merger(arr,start,mid,end);
    }
    static void merger(int[] arr,int start,int mid,int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i<mid && j<end) {
            if(arr[i]>arr[j]) {
                mix[k] = arr[j];
                j++;
            }
            else {
                mix[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<mid) {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<end) {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int m = 0; m < mix.length; m++) {
            arr[start+m] = mix[m];
        }
    }
}
