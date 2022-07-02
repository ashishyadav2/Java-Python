import java.util.ArrayList;

public class ReturnArrListNoArgs {
    public static void main(String[] args) {
        int[] arr = {1,2,34,34,34,34,68,5,8};
        int target = 34;
        System.out.println(func(arr, target, 0));
    }
    static ArrayList<Integer> func(int[] arr,int target,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length) {
            return list;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        ArrayList<Integer> prevAns = func(arr, target, index+1);
        list.addAll(prevAns);
        return list;
    }
}
