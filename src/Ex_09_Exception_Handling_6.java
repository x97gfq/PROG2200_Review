import java.util.ArrayList;
import java.util.Scanner;

public class Ex_09_Exception_Handling_6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a number: ");
            try {
                Scanner reader = new Scanner(System.in);
                int n = reader.nextInt();
                list.add(n);
            } catch (Exception exc) {
                //do nothing, dump exception string to console
                System.out.println(exc.toString());
            }

        }
    }
}
