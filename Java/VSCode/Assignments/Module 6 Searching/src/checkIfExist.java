public class checkIfExist {
    public static void main(String[] args) {
        int[] arr = {10,1,5,11};
        System.out.println(check(arr));
    }
    static boolean check(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                count++;
            }
        }
        if(count>1) {
            return true;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                int temp1= arr[i];
                temp1 = temp1*2;
                for(int j=0;j<arr.length;j++) {
                    if(temp1==arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
