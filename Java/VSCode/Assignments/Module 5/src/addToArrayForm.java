import java.util.Arrays;

public class addToArrayForm {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        int[] ans = add(num,k);
        System.out.println(Arrays.toString(ans));
    }
    static int[] add(int[] num ,int k) {
        int number = 0;
        int end = num.length -1;
        for(int i=0;i<=end;i++) {
            number += num[i]*Math.pow(10,end-i);
        }
        number += k;
        int count = 0;
        int temp = number;
        while(temp>0) {
            temp = temp / 10;
            count++;
        }
        int[] karr = new int[count];
        for(int i=count-1;i>=0;i--) {
            while(number>0) {
                int rem = number%10;
                karr[i--] = rem;
                number = number / 10;
            }
        }
        return karr;
    }
}
