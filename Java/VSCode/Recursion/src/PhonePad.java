import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        // pad("", "23");
        // System.out.println(padd("", "12"));
        // paddd("", "12",list);
        // System.out.println(list);
        // paddd("", "12",list);
        System.out.println(padCount2("","12",0));
    }
    static void pad(String p,String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit =  up.charAt(0) - '0';
        for (int index = (digit-1)*3; index < digit*3; index++) { 
            char ch = (char) ('a'+index);
            pad(p+ch, up.substring(1));
        }
    }
    static int padCount(String p,String up) {
        if(up.isEmpty()) {
            return 1;
        }
        int digit =  up.charAt(0) - '0';
        int count = 0;
        for (int index = (digit-1)*3; index < digit*3; index++) { 
            char ch = (char) ('a'+index);
            count += padCount(p+ch, up.substring(1));
        }
        return count;
    }
    static int padCount2(String p,String up,int count) {
        if(up.isEmpty()) {
            return count;
        }
        int digit =  up.charAt(0) - '0';
        for (int index = (digit-1)*3; index < digit*3;) { 
            char ch = (char) ('a'+index);
            return padCount2(p+ch, up.substring(1),count+1);
        }
        return count;
    }
    static ArrayList<String> padd(String p,String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit =  up.charAt(0) - '0';
        ArrayList<String> listAns = new ArrayList<>();
        for (int index = (digit-1)*3; index < digit*3; index++) { 
            char ch = (char) ('a'+index);
            // ArrayList<String> listAnsTemp = padd(p+ch, up.substring(1));
            listAns.addAll(padd(p+ch, up.substring(1)));
        }
        return listAns;
    }
    static ArrayList<String> list = new ArrayList<>();
    static void paddd(String p,String up,ArrayList<String> list) {
        if(up.isEmpty()) {
            list.add(p);
            return;
        }
        int digit =  up.charAt(0) - '0';
        for (int index = (digit-1)*3; index < digit*3; index++) { 
            char ch = (char) ('a'+index);
            // ArrayList<String> listAnsTemp = padd(p+ch, up.substring(1));
            paddd(p+ch, up.substring(1),list);
        }
    }
}
