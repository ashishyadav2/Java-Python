public class BookAllocation {
    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int m = 2;
        System.out.println(books(pages,m));
    }
    static int books(int[] pages,int m) {
        int start =0,end=0;
        for(int i=0;i<pages.length;i++) {
            start = Math.max(0,pages[i]);
            end += pages[i];
        }
        while(start<end) {
            int sum = 0;
            int pecies = 1;
            int mid = start + (end-start)/2;
            for(int i=0;i<pages.length;i++) {
                if(sum+pages[i]>mid) {
                    sum =  pages[i];
                    pecies++;
                }
                else {
                    sum+=pages[i];
                }
            }
            if(pecies>m) {
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
