import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        // permute("", "abc");
        // System.out.println(permuteCount("", "abcd"));
        // System.out.println(permuteCount2("", "abcd",0));
        // System.out.println(permuted("", "abc"));
    }
    static void permute(String p,String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            permute(first+ch+last, up.substring(1));
        }
    }
    static int permuteCount(String p,String up) {
        if(up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            count = count + permuteCount(first+ch+last, up.substring(1));
            
        }
        return count;
    }
    static int permuteCount2(String p,String up,int count) {
        if(up.isEmpty()) {
            return count;
        }
        char ch = up.charAt(0);
        String first;
        String last;
        for (int i = 0; i <= p.length(); i++) {
            first = p.substring(0, i);
            last = p.substring(i, p.length());
            return permuteCount2(first+ch+last, up.substring(1),count+1);
        }
        return permuteCount2(p, up.substring(1),count);
    }
    static ArrayList<String> permuted(String p,String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            ans.addAll(permuted(first+ch+last, up.substring(1)));
        }
        return ans;
    }
}
