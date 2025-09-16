public class Ex_02_Functions {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod1(String message) {
        System.out.println(message);
    }

    static String myMethod2() {
        return "I just got returned!";
    }

    static double calculateTax(double price) {
        double taxrate = 0.14;
        return price * taxrate;
    }

    public static void main(String[] args) {

        double[] prices = { 100, 101 };

        for (double price : prices) {
            double total = calculateTax(price);
            System.out.println(total);
        }


        /*
        myMethod();

        myMethod1("I just ran this!");

        String message = myMethod2();
        System.out.println(message);

         */
    }
}
