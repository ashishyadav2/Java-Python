public class countMatches {
    public static void main(String[] args) {
        String[][] items = {{"phone","silver","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(findMatch(items, ruleKey, ruleValue));
    }
    static int findMatch(String[][] items,String ruleKey, String ruleValue) {
        int find =0;
        for(int i=0;i<items.length;i++) {
            if(ruleKey=="type") {
                if(items[i][0].equals(ruleValue)) {
                    find++;
                }
            }
            if(ruleKey=="color") {
                if(items[i][1].equals(ruleValue)) {
                    find++;
                }
            }
            if(ruleKey=="name") {
                if(items[i][2].equals(ruleValue)) {
                    find++;
                }
            }
        }
        return find;
    }
}
