public class arrangeCoins {
    public static void main(String[] args) {
        System.out.println(coins(5));
    }
    static int coins(int num) {
        long start = 0, end = num;
        while(start<=end) {
            long mid = start + (end-start)/2;
            long curr = mid * (mid +1) /2;
            if(curr==num) {
                return (int)mid;
            }
            else if(curr>num) {
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return (int)end;
    }
}
