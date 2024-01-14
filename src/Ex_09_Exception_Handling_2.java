import java.util.Scanner;

public class Ex_09_Exception_Handling_2 {

    public static void main(String[] args) {

        try {

            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a number: ");
            int n = reader.nextInt(); // Scans the next token of the input as an int.

            System.out.println("Enter another number: ");
            int m = reader.nextInt(); // Scans the next token of the input as an int.

            //once finished
            reader.close();

            float result = n / m;

            System.out.println("result is " + result);

        } catch (ArithmeticException exception) {
            System.out.println("arithmetic exception: " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("exception: " + exception.getMessage());
        }
    }
}
