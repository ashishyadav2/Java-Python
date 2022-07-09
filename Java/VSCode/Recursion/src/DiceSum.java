import java.util.ArrayList;

public class DiceSum {
    public static void main(String[] args) {
        // System.out.println(targetSum2("", 1));
        System.out.println(customFace("", 2,8));
        // targetSum("",4);        
    }
    static void targetSum(String p,int upNum) {
        if(upNum==0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i<=upNum; i++) {
            targetSum(p+i, upNum-i);
        }
    }
    static ArrayList<String> targetSum2(String pNum,int upNum) {
        if(upNum==0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pNum);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=upNum; i++) {
            ans.addAll(targetSum2(pNum+i, upNum-i));
        }
        return ans;
    }
    static ArrayList<String> customFace(String pNum,int upNum,int face) {
        if(upNum==0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pNum);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i<=upNum; i++) {
            ans.addAll(customFace(pNum+i, upNum-i,face));
        }
        return ans;
    }
}
