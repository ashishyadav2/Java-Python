import org.w3c.dom.events.Event;

public class minCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(cost(position));
    }
    static int cost(int[] position) {
        int evnCount = 0;
        int oddCount = 0;
        int cost = 0;
        for(int i=0;i<position.length;i++) {
            if(position[i]%2==0) {
                evnCount++;
            }
            else {
                oddCount ++;
            }
        }
        if(evnCount>oddCount) {
            cost = oddCount;
        }
        else {
            cost = evnCount;
        }
        return cost;
    }
}
