public class shipWithinDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDayss(weights,days));
    }
    static boolean isPossible(int mid,int[] weights,int days) {
        int d = 1;
        int sum = 0;
        for(int i=0;i<weights.length;i++) {
            if(sum+weights[i]<=mid) {
                sum+=weights[i];
            }
            else {
                sum = weights[i];
                d++;
            }
        }
        if(d<=days) {
            return true;
        }
        return false;
    }
    static int shipWithinDayss(int[] weights, int days) {
        int min = Integer.MIN_VALUE;
        int max = 0;
        for(int i=0;i<weights.length;i++) {
            min = Math.max(min,weights[i]);
            max += weights[i];
        }
        int ans = 0;
        while(min<=max) {
            int mid = min + (max-min)/2;
            if(isPossible(mid,weights,days)) {
                ans = mid;
                max = mid -1;
            }
            else {
                min = mid+1;
            }
        }
        return ans;
    }
}
