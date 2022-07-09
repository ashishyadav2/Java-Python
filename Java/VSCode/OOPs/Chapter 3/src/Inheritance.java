public class Inheritance {
    public static void main(String[] args) {
        Box box1 = new Box(4,5,6);
        Box box = new Box(box1);
        // System.out.println(box.width);
        // System.out.println(box.hieght);
        // System.out.println(box.length);

        BoxChild boxchild = new BoxChild(4,5,6,45);
        System.out.println(boxchild.width);
        System.out.println(boxchild.hieght);
        System.out.println(boxchild.length);
        System.out.println(boxchild.weight);
        boxchild.information();
        
    }
    //child class extends Base Class
}
class BoxChild extends Box {
    double weight;
    BoxChild() {
        this.weight = -45;
    }
    BoxChild(double w,double h,double l,double weight) {
        //used to initailize the variables in parent class
        super(w,h,l);//calling constructor of parent class constructor
        this.weight = weight;
    }
}
class Box {
    double width;
    double hieght;
    double length;
    Box() {
        this.width = -1;
        this.hieght = -1;
        this.length = -1;
    }
    Box(double side) {
        this.width = side;
        this.hieght = side;
        this.length = side;
    }
    Box(double w,double h, double l) {
        this.width = w;
        this.hieght = h;
        this.length = l;
    }
    Box(Box old) {
        this.width = old.width;
        this.hieght = old.hieght;
        this.length = old.length;
    }
    public void information() {
        System.out.println("Running the box");
    }
}
