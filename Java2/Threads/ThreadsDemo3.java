package Threads;

public class ThreadsDemo3 implements Runnable{
    private static int counter = 0;
    public static void main(String[] args) {
        ThreadsDemo3 obj1 = new ThreadsDemo3();
        Thread thread  = new Thread(obj1);
        Thread thread1 =  new Thread(obj1);
        thread.start();
        thread1.start();
        while(thread.isAlive()) {
            System.out.println("Waiting");
        }
        System.out.println("Main: "+counter);
        while(thread1.isAlive()) {
            System.out.println("Waiting");
        }
        counter++;
        System.out.println("Main: "+counter);
    }
    public void run() {
        counter++;
    }
}
