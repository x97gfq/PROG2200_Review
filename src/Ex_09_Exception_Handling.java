public class Ex_09_Exception_Handling {

    public static void main(String[] args) {

        try {
            //
            throw new Exception("throwing an exception");
            //
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
