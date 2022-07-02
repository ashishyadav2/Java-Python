import java.util.ArrayList;
import java.util.Arrays;

public class ReturnArrList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7,7};
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(fun(arr, target, 0, list));
    }
    static ArrayList<Integer> fun(int[] arr,int target,int index, ArrayList<Integer> list) {
        if(index==arr.length) {
            return list;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        return fun(arr, target, index+1, list);
    }
}
