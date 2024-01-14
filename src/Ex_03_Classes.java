import classes.Student;

public class Ex_03_Classes {

    public static void main(String[] args) {

        //creates a new classes.Student object, using setters
        Student stu1 = new Student();
        stu1.setFirstName("Fred");
        stu1.setLastName("Flintstone");

        //creates a new classes.Student object, passing values in via the Constructor
        Student stu2 = new Student("Wilma", "Flintstone");

        //call the 'toString' method on both objects:
        System.out.println(stu1);
        System.out.println(stu2);
    }
}

