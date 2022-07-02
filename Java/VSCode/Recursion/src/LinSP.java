import java.util.ArrayList;

public class LinSP {
    public static void main(String[] args) {
        int[] arr = {8,2,5,2,5,0,2,6};
        int target = 2;
        lin(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer>  list = new ArrayList<>();
    static void lin(int[] arr,int target,int index) {
        if(index==arr.length) {
            return;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        lin(arr, target, index+1);
    }
}
