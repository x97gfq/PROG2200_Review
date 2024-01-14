public class Ex_07_Enumerations {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        if (myVar == Level.MEDIUM) {
            System.out.println(Level.MEDIUM);
        }

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        printEnum(myVar);
    }

    public static void printEnum(Level level) {
        System.out.println(level);
    }


}
