import javax.swing.plaf.TextUI;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(isPangram(sentence));
    }
    static boolean isPangram(String sentence) {
        for(int i=0;i<sentence.length();i++) {
            if(sentence.contains("")) {
                return true;
            }
        }
        return false;
    }
    static boolean masking(String sentence) {
        boolean[] mask = new boolean[sentence.length()];
        for(int i=0;i<sentence.length();i++) {
            
        }
    }
}
