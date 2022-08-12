public class findMaxValueOfEquation {
    public static void main(String[] args) {
        int[][] points = {{0,0},{3,0},{9,2}};
        int k = 3;
        int ans = maxEq(points,k);
        System.out.println(ans);
    }
    static int maxEq(int[][] points,int k) {
        int max = 0,var = 0;
        for(int i=0;i<points.length-1;i++) {
            int j=i+1;
            int temp = points[i][0]-points[j][0];
            if(Math.abs(temp) <= k) {
                int tempYi = points[i][1];
                int tempYj = points[j][1];
                var = tempYi + tempYj + Math.abs(temp);
            }
            if(var>max) {
                max = var;
            }
        }
        return max;
    }
}
