public firstBadVersion  {
    public static void main(String[] args) {
        int n = 5;
    }
    int badVer(int n) {
        int ans = 0;
        if(n==1) {
            return ans =1;
        }
        else {
        for(int i=0;i<n;i++) {
            if(isBadVersion(i)) {
                ans = i;
                break;
            }
        }
    }
        return ans;
    }
}