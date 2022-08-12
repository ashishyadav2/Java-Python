import java.util.Arrays;

public class fairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {2};
        int[] bobSizes = {1,3};
        System.out.println(Arrays.toString(fairCandySwaps(aliceSizes, bobSizes)));
    }
    static int[] fairCandySwaps(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;
        for (int index = 0; index < aliceSizes.length; index++) {
            sumAlice += aliceSizes[index];
        }
        for (int index = 0; index < bobSizes.length; index++) {
            sumBob += bobSizes[index];
        }
        int delta = (sumBob-sumAlice)/2;
        int[] temp = new int[bobSizes.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = bobSizes[i];
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]==aliceSizes[i]+delta) {
                return new int[]{aliceSizes[i],aliceSizes[i]+delta};
            }
        }
        return new int[]{-1,-1};
    }
}
