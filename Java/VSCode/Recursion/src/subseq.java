import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        // sub("", "abc");
        subseqAscii("", "abc");
        // System.out.println(subSq("", "abc"));
    }
    static void sub(String p,String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(p + ch, up.substring(1));
        sub(p, up.substring(1));
    }
    static ArrayList<String> subSq(String p,String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSq(p+ch, up.substring(1));
        ArrayList<String> right = subSq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p,String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(p+ch, up.substring(1));
        sub(p, up.substring(1));
        sub(p + (ch+0), up.substring(1));
    }
}
