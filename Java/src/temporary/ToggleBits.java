package temporary;

public class ToggleBits {
    public static void main(String[] args) {
        int nums = 10;
        String binNum = Integer.toBinaryString(nums);
        char[] binNumArr = binNum.toCharArray();
        for(int i=0;i<binNumArr.length;i++) {
            if(binNumArr[i]=='0') binNumArr[i] = '1';
            else binNumArr[i] = '0';
        }
        String ans = new String(binNumArr);
        int decimal = Integer.parseInt(ans,2);
        System.out.println(decimal);
    }
}
