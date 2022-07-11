public class Polymorphism {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        // Square square = new Square();
        Shapes square = new Square();
        shape.area();
        triangle.area();
        circle.area();
        square.area();
    }
}
class Shapes {
    void area() {
        System.out.println("I am in shapes");
    }
}
class Triangle extends Shapes{
    void area() {
        System.out.println("0.5*b*h");
    }
}
class Circle extends Shapes{
    void area() {
        System.out.println("2*pi*r*r");
    }
}
class Square extends Shapes{
    void area() {
        System.out.println("s*s");
    }
}
