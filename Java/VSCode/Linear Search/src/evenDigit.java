public class evenDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        evendigit(arr);
    }
    static void evendigit(int[] arr) {
        int num = arr[0];
        int ans = 0;
        for(int i=0;i<arr.length;i++) {
            num = arr[i];
            int count = 0;
            while(num>0) {
                count++;
                num = num / 10;
            }
            if(count%2==0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
