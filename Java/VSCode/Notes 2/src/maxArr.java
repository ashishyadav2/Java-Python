public class maxArr {
    public static void main(String[] args) {
        int[] arr = {5,8,9,54,8};
        int maxm = arr[0];
        max(arr,maxm);
    }
    static void max(int[] arr, int maxm) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>maxm) {
                maxm = arr[i];
            }
        }
        System.out.println(maxm);
    }
}
