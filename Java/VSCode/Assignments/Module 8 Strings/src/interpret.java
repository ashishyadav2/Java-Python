public class interpret {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(stringg(command));
    }
    static String stringg(String command) {    
        String output ="";
        for(int i=0;i<command.length();i++) {
            if(command.charAt(i)=='(') {
                if(command.charAt(i+1)==')') {
                    output+="o";
                }
                if(command.charAt(i+1)!=')') {
                    output+="al";
                }
            }
            if(command.charAt(i)=='G') {
                output+="G";
            }
        }
        return output;
    }
}
