package Temp.pra2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class TClass {
    int n;
    int id;
    String name;
    int iter;
    String s;
    int p;
    int q;
    String r;
    int s2;

    @Override
    public String toString() {
        return "TClass{" +
                "n=" + n +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", iter=" + iter +
                ", s='" + s + '\'' +
                ", p=" + p +
                ", q=" + q +
                ", r='" + r + '\'' +
                ", s=" + s +
                '}';
    }
}
public class InputPractice {
    public static void main(String[] args) {
        File fileObj = new File("C:\\Users\\ashis\\IdeaProjects\\JavaLessons\\src\\Temp\\pra2\\input.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(fileObj);
            int n = sc.nextInt();
            TClass[] arr = new TClass[n];
            for(int i=0;i<n;i++){
                double id = sc.nextDouble();
                sc.nextLine();
                String name = sc.nextLine();
                int iter = sc.nextInt();
                String s = "";
                int p = 0;
                for(int j=0;j<iter;j++) {
                    sc.nextLine();
                    s = sc.nextLine();
                    p = sc.nextInt();
                    System.out.println(s+ " "+p);
                }
                arr[i] = new TClass();
                System.out.println(id+" "+name+" "+iter);
            }
            int q = sc.nextInt();
            sc.nextLine();
            String r = sc.nextLine();
            int s2 = sc.nextInt();
            System.out.printf("%d %s %d",q,r,s2);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        finally {
            assert sc != null;
            sc.close();
        }
    }
}
