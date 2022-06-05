public class reverse {
    public static void main(String[] args) {
        int n = 23597;
        int rem;
        int ans=0;
        while(n>0) {
            rem = n % 10;
            n = n / 10;
            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
