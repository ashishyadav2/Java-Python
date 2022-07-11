public class Inheritance {
    public static void main(String[] args) {
        Box box1 = new Box(4,5,6);
        Box box = new Box(box1);
        // System.out.println(box.width);
        // System.out.println(box.hieght);
        // System.out.println(box.length);

        BoxChild boxchild = new BoxChild(4,5,6,45);
        // System.out.println(boxchild.width);
        // System.out.println(boxchild.hieght);
        // System.out.println(boxchild.length);
        // System.out.println(boxchild.weight);
        // boxchild.information();

        // BoxPrice boxPrice1 = new BoxPrice(); 
        BoxPrice boxPrice = new BoxPrice(5,6,7,8,9);
        System.out.println(boxPrice.width);
        System.out.println(boxPrice.hieght);
        System.out.println(boxPrice.length);
        System.out.println(boxPrice.weight);
        System.out.println(boxPrice.cost);
        boxPrice.information();
        
    }
    //child class extends Base Class
}
class BoxPrice extends BoxChild {
    double cost;
    BoxPrice() {
        super();
        this.cost = -1;
    }
    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }
    BoxPrice(double l,double h,double w,double weight,double cost) {
        super(l,h,w,weight,cost);
        this.cost = cost;
    }

}
class BoxChild extends Box {
    double weight;
    BoxChild() {
        this.weight = -45;
    }
    BoxChild(BoxChild other) {
        this.weight = other.weight;
    }
    BoxChild(double w,double h,double l,double weight) {
        //used to initailize the variables in parent class
        super(w,h,l);//calling constructor of parent class constructor
        this.weight = weight;
    }
    BoxChild(double w,double h,double l,double weight,double cost) {
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
