public class maxValue {
    public static void main(String[] args) {
        System.out.println(binSrch(4, 2, 6));
    }

    static int binSrch(int n, int index, int maxSum) {
        int start = 0;
        int end = maxSum;
        int sum = 0;
        int left = index;
        int right = n-1-index;
        int result = 0;
        while(start<=end) {
            int midd = start + (end-start)/2;
            int mid = midd-1;
            int leftt = ls(left,mid,n);
            int rightt = rs(right,mid,n);
            sum = mid + leftt + rightt;
            if(sum>maxSum) {
                end = mid-1;
            }
            else if(sum<=maxSum) {
                result = mid;
                start = mid+1;
            }
        }
        return result;
    }
    static int ls(int left,int mid,int n) {
        if(mid>=left) {
            return (mid*(mid+1)/2) - ((mid-left)*(mid-left+1))/2;
        }
        else {
            return (mid*(mid+1)/2) + 1*(left-mid);
        }
    }
    static int rs(int right,int mid,int n) {
        if(mid>=right) {
            return (mid*(mid+1)/2) - ((mid-right)*(mid-right+1))/2;
        }
        else {
            return (mid*(mid+1)/2) + 1*(right-mid);
        }
    }
}