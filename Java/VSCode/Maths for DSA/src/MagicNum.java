public class MagicNum {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(magNum(num));
    }
    static int magNum(int num) {
        int sum = 0;
        int i=1;
        while(num>0) {
            int temp = num & 1;
            sum += temp*Math.pow(5, i);
            num = num>>1; 
            i++;
        }
        return (int)sum;
    }
}
