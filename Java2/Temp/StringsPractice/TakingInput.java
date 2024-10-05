package Temp.StringsPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        String filename = "C:\\Users\\ashis\\IdeaProjects\\JavaLessons\\src\\Temp\\StringsPractice\\input.txt";
        File fobj = new File(filename);
        try(Scanner sc = new Scanner(fobj)) {
            int iter = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<iter;i++) {
                String str = sc.nextLine();
                double num = sc.nextDouble();
                sc.nextLine();
                int num1 = sc.nextInt();
                sc.nextLine();
                boolean bool = sc.nextBoolean();
                sc.nextLine();
                System.out.printf("String: %s, Double: %f, Int: %d, Boolean: %b%n",str,num,num1,bool);
            }
            int id = sc.nextInt();
            sc.nextLine();
            String strr = sc.nextLine();
            System.out.printf("Id: %d%nString: %s",id,strr);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
