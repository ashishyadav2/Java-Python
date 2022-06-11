import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5,3},
                    {7,3},
                    {3,2,1,5}        
                    };
        System.out.println(max(accounts));
    }
    static int max(int[][] accounts) {
        int maxWealth;
        int max=0;
        for(int i=0;i<accounts.length;i++) {
            maxWealth = 0;
            for(int j=0;j<accounts[i].length;j++) {
                maxWealth += accounts[i][j];
            }
            if(maxWealth>max) {
                max = maxWealth;
            }
        }
        return max;
    }
}
