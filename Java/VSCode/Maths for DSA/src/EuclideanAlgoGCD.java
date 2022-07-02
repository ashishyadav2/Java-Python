public class EuclideanAlgoGCD {
    public static void main(String[] args) {
        System.out.println(gcd(4, 28));
        System.out.println(lcm(4, 28)); 
    }
    static int gcd(int a,int b) {
        if(a==0) {
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a,int b) {
        int lcm = (a*b)/gcd(a, b);
        return lcm;
    }
}
