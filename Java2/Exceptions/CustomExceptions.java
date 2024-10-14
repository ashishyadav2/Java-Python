package Exceptions;

class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        int a = 5;
        try {
            throw new MyException("cannot divide by zero");
        }
        catch (MyException e){
            e.printStackTrace();
            System.out.println("Exception occurred");
        }
    }
}
