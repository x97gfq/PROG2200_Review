import java.util.ArrayList;

public class Ex_09_Exception_Handling_1 {

    public static void main (String[] args) {

        try {
            int i = 0;
            int x = 1;
            int answer = x / i;

            System.out.println(answer);

            ArrayList<String> list = new ArrayList<String>();
            String entry = list.get(1);

        } catch (ArithmeticException exc) {
            System.out.println("artihmetic");
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("index exception");
        } catch (Exception exc) {
            System.out.println("exc");
        }

    }
}
