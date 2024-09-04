package Threads;

public class ThreadsDemo1 extends Thread{
    public static void main(String[] args) {
        ThreadsDemo1 obj1 = new ThreadsDemo1();
        obj1.start();
        System.out.println("In main thread");
    }
    public void run() {
        System.out.println("In thread");
    }
}
