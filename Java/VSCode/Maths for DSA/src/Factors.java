import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factor(20);
    }
    static void factor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 1; index <= Math.sqrt(n); index++) {
            if(n%index==0) {
                if(n/index == index) {
                    System.out.print(index+" ");
                }
                else {
                    System.out.print(index+" ");
                    list.add(n/index);
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
