package Exceptions;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ExceptionsDemo {
    private static void checkAge(int age){
        if (age<18) {
            throw new ArithmeticException("Age should be greater than 18");
        }
        else {
            System.out.println("Welcome!");
        }
    }
    public static void main(String[] args) {
        try {
            int i = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println(e+ " Cannot divide by zero");
        }
        catch (Exception e){
            System.out.println(e+" [something went wrong]");
        }
        finally {
            System.out.println("Try catch block ended");
        }
        checkAge(150);
    }
}
