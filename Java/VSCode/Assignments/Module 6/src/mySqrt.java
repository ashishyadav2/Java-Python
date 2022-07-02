public class mySqrt {
    public static void main(String[] args) {
        int num = 79;
        System.out.println(sqrt(num));
    }
    static int sqrt(int num) {
        int i=1;
        int temp = num;
        int count = 0;
        while(num>0) {
            num -= i;
            i=i+2;
            count++;
        }
        int sqroot = temp/count;
        return sqroot;
    }
}
