public class minNum {
    public static void main(String[] args) {
        int[] arr = {9,65,564,465,546,123,95,12};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int min = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
}
