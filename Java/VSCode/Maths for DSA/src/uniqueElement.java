public class uniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,4,7,4};
        System.out.println(findUni(arr));
    }
    static int findUni(int[] arr) {
        int unique = 0;
        for(int i=0;i<arr.length;i++) {
            unique^= arr[i];
        }
        return unique;
    }
}
