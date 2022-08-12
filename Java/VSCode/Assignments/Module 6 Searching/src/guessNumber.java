public class guessnumber {
    public static void main(String[] args) {
        int n = 10;
        int pick = 6;
    }
    static int srch(int[] arr,int pick) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            int result = guess(mid,num);
            if(result<0) {
                end = mid -1 ;
            }
            else if(result>0) {
                start = mid + 1 ;
            }
            else {
                return mid;
            }
        }
    }
    static int guess(int mid,int pick) {
        if(pick<mid) {
            return 1;
        }
        else if(pick>mid) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
