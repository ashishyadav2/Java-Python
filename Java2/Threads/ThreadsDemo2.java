package Threads;

public class ThreadsDemo2 implements Runnable{
    public static void main(String[] args) {
        ThreadsDemo2 obj1 = new ThreadsDemo2();
        Thread thread = new Thread(obj1);
        thread.start();
        System.out.println("In main thread");
    }
    public void run() {
        System.out.println("In thread");
    }
}
