import java.util.*;
public class countMatches {
    public static void main(String[] args) {
        List<List<String>> items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatchess(items,ruleKey,ruleValue));
    }
    static int countMatchess(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> list: items) {
            if(ruleKey.equals("type")) {
                if(list.get(0).equals(ruleValue)) {
                    count++;
                }
            }
            else if(ruleKey.equals("color")) {
                if(list.get(1).equals(ruleValue)) {
                    count++;
                }
            }
            else {
                if(list.get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}
