public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        // double ans = sqrt(n,precision);
        System.out.printf("%.3f",sqrt(n,precision));
    }
    static double sqrt(int n,int precision) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid*mid > n) {
                end = mid-1;
            }
            else if(mid*mid < n){
                start = mid + 1;
            }
            else {
                return mid;
            }
            double inc = 0.1;
            for (int i = 0; i < precision; i++) {
                while(root*root<=n) {
                    root+=inc;
                }
                root-=inc;
                inc/=10;
            }
        }
        return root;
    }
}
