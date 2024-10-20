package Temp.pra2;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class Student {
    int sid;
    String name;
    ArrayList<String> subjects;
    ArrayList<Integer> marks;

    public Student(int sid, String name, ArrayList<String> subjects, ArrayList<Integer> marks) {
        this.sid = sid;
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    public double getAvg(){
        double sum = 0;
        int size = 0;
        for(int a: this.marks){
            sum+=a;
            size+=1;
        }
        return sum/size;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                ", marks=" + marks +
                '}';
    }
}
public class Practice2 {
    public static ArrayList<Student> findAns(ArrayList<Student> arr, double param1){
        ArrayList<Student> ans = new ArrayList<>();
        for(Student s: arr){
            if(s.getAvg()>param1){
                ans.add(s);
            }
        }
        return ans;
    }
    public static ArrayList<Student> getStudents(ArrayList<Student> arr){
        ArrayList<Student> ans = new ArrayList<>();
        for(Student s: arr){
            HashSet<Integer> set = new HashSet<>(s.marks);
            if(s.marks.size()==set.size()){
                ans.add(s);
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Exception{
        String path = "C:\\Users\\ashis\\IdeaProjects\\JavaLessons\\src\\Temp\\pra2\\input4.txt";
        File fileObj = new File(path);
        Scanner sc = new Scanner(fileObj);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Student> arr = new ArrayList<>();
        for( int i=0;i<n;i++){
            int sid = Integer.parseInt(sc.nextLine().trim());
            String name = sc.nextLine();
            int nSubs = Integer.parseInt(sc.nextLine().trim());
            ArrayList<String> subjects = new ArrayList<>();
            ArrayList<Integer> marks = new ArrayList<>();
            for(int j=0;j<nSubs;j++){
                String subject = sc.nextLine();
                int mark = Integer.parseInt(sc.nextLine().trim());
                subjects.add(subject);
                marks.add(mark);
            }
            arr.add(new Student(sid,name,subjects,marks));
        }
        double param1 = Double.parseDouble(sc.nextLine().trim());
        ArrayList<Student> ans = findAns(arr,param1);
        for(Student s: ans){
            System.out.println(s.name);
        }
        ArrayList<Student> ans2 = getStudents(arr);
        for(Student s: ans2){
            System.out.println(s);
        }
    }
}
