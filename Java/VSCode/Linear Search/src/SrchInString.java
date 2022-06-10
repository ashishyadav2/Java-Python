import java.rmi.server.RemoteRef;
import java.util.Scanner;

public class SrchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char targetStr = input.next().trim().charAt(0);
        System.out.println(search(str,targetStr));
    }
    static boolean search(String str,char targetStr) {
        if(str.length() == 0) {
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(targetStr == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
