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

    public static void main(String[] args) {
        myMethod();

        myMethod1("I just ran this!");

        var message = myMethod2();
        System.out.println(message);
    }
}
