import java.util.Scanner;

public class vowel {
    // a,i,e,u,o
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch=='a'||ch=='i'||ch=='e'||ch=='u'||ch=='o') {
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }
    }
}
