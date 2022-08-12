public class findContentChildren {
    public static void main(String[] args) {
        int[] g = {1,1};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int j=0;
        int i=0;
        while(i<g.length&&j<s.length) {
            if(g[i]<=s[j]) {
                i++;
                ans++;
            }
            j++;
        }
        return ans;
    }
}
