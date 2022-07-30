public class Interface {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
class Car implements Engine,Brake,Media {
    @Override 
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

}
 interface Engine {
    static final int price = 78000;
    void start();
    void stop();
    void acc();
}
 interface Brake {
    void brake();
}
 interface Media {
    void start();
    void stop();
}
