package Exceptions;

class MyException extends Exception {
    public MyException(String message){
        super(message);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        int a = 15;
        try{
            if( a>10) {
                throw new MyException("something went wrong");
            }
        }
        catch (MyException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
