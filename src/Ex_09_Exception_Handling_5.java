import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09_Exception_Handling_5 {

    public static void main(String[] args) {
        //first -
        //checkAge(15); // Set age to 15 (which is below 18...)

        //then handle exception:
        /*
        try {
            checkAge(15);
        } catch (Exception exc) {
            System.out.println("exception caught:");
            System.out.println(exc.getMessage());
        }
        */
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

}
