public class minEatingSpeed {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeedd(piles, h));
    }
    static int minEatingSpeedd(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high,piles[i]);
        }
        while(low<high) {
            int mid = (low+high)/2;
            if(isPossible(piles,mid,h)) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    static boolean isPossible(int[] piles,int rate,int h) {
        int total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += piles[i]/rate + (piles[i]%rate > 0 ? 1 : 0);
        }
        return total<=h;
    }
}