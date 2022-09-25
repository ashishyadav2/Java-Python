public class halvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlikee(s));
    }
    static boolean halvesAreAlikee(String s) {
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());
        int s1count=0,s2count=0;
        String[] vowels= {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        // for(int i=0;i<vowels.length;i++) {
        //     s1.contains(vowels[i]);
        //     s1count++;
        // }
        // for(int i=0;i<vowels.length;i++) {
        //     s2.contains(vowels[i]);
        //     s2count++;
        // }
        for(int i=0;i<s1.length();i++) {
            for(int j=0;j<vowels.length;j++) {
                if(s1.charAt(i)==vowels[j].charAt(0)) {
                    s1count++;
                }                
            }
        }
        for(int i=0;i<s2.length();i++) {
            for(int j=0;j<vowels.length;j++) {
                if(s2.charAt(i)==vowels[j].charAt(0)) {
                    s2count++;
                }                
            }
        }
        if(s1count==s2count) {
            return true;
        }
        return false;
    }
}