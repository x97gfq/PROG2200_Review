import java.util.ArrayList;
import java.util.Scanner;

public class Ex_09_Exception_Handling_3 {

    public static void main(String[] args) {

        try {

            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a number: ");
            int n = reader.nextInt(); // Scans the next token of the input as an int.

            //once finished
            reader.close();

            ArrayList<String> list = new ArrayList<String>();
            list.add("first entry");
            list.add("second entry");

            String entry = list.get(n);

            System.out.println("entry is " + entry);

        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
