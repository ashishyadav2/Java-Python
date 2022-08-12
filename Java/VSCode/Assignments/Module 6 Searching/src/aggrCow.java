public class aggrCow {
    public static void main(String[] args) {
        
    }
    static boolean isPossible(int mid,int k,int[] stalls) {
        int count = 1;
        int pos = stalls[0];
        for(int i=1;i<stalls.length;i++) {
            if(stalls[i]-pos>=mid) {
                count++;
                pos =  stalls[i];
                if(count==k) {
                    return true;
                }
            }
        }
        return false;
    }
    static int aggrcow(int[] stalls,int k) {
        int result = -1;
        int start = 0;
        int end = stalls[stalls.length-1];
        while(start<end) {
            int mid = start + (end-start)/2;
            if(isPossible(mid,k,stalls)) {
                result = Math.max(result,mid);
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return result;
    }
}
