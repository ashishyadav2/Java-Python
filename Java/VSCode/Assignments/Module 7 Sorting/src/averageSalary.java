import java.util.Arrays;
public class averageSalary {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for(int i=1;i<salary.length-1;i++) {
            sum += salary[i];
        }
        return sum/(salary.length-2);
    }
}
