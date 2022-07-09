public class Intro {
    public static void main(String[] args) {
        Student s1 = new Student();//this is constructor 
        s1.rollNo = 25;
        s1.name = "John";
        s1.marks = 95f;
        Student s2 = new Student(15,"Ashish",89.6f);
        // s2.changeName("Ashish Yadav");
        // s2.greeting();
        Student s3 = new Student(s2);
        System.out.println(s3.rollNo);
        System.out.println(s3.name);
        System.out.println(s3.marks);
        Student s4 = new Student();
    }
}
class Student{
    int rollNo;
    String name;
    float marks;
    //constructor same name as class
    //constructor overloading
    //polymorphism
    // Student() {
    //     this.rollNo = 26;
    //     this.name = "Cena";
    //     this.marks = 89.6f;
    // }
    // calling constructor from another constructor
    Student() {
        this (19,"John Cena",59.9f);
    }
    Student(Student s2) {
        this.rollNo = s2.rollNo;
        this.name = s2.name;
        this.marks = s2.marks;
    }
    Student(int rno,String name,float marks) {
        this.rollNo = rno;
        this.name = name;
        this.marks = marks;
    }
    void greeting() {
        System.out.println("Hello my name is "+name);
    }
    void changeName(String newName) {
        this.name = newName;
    }
}
