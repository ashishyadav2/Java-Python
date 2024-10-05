package Temp;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isLeap = false;
        if(num%4==0) {
            if (num%100==0) {
                if (num%400==0){
                    isLeap = true;
                }
            }
            else {
                isLeap = true;
            }
        }
        System.out.println(isLeap ? "Leap year" : "Not leap");
        sc.close();
    }
}
