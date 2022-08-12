public class divideChocolate {
    public static void main(String[] args) {
        int[] sweetness = {5,6,7,8,9,1,2,3,4};
        int k = 8;
        System.out.println(divideChocolate(sweetness,k));
    }
    static int divideChocolate(int[] sweetness,int k) {
        k++;
        int start = Integer.MAX_VALUE,end=0;
        for(int i=0;i<sweetness.length;i++) {
            end += sweetness[i];
            start = Math.min(start,sweetness[i]);
        }
        while(start<end) {
            int sum = 0;
            int pecies = 0;
            int mid= start+(end-start)/2;
            for(int i=0;i<sweetness.length;i++) {
                if(sum+sweetness[i]>mid) {
                    sum =  sweetness[i];
                    pecies++;
                }
                else {
                    sum+=sweetness[i];
                }
            }
            if(pecies>k) {
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
