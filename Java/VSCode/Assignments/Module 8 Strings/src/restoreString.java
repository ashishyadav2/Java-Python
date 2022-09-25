public class restoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        System.out.println(stringg(indices,s));
    }
    static String stringg(int[] indices,String s) {
        char[] chArr = new char[indices.length];
        for(int i=0;i<indices.length;i++) {
            chArr[indices[i]] = s.charAt(i);
        }
        String str = new String(chArr);
        return str;
    }
}
