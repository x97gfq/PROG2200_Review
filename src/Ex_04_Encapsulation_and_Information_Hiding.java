import classes.Student;

import java.time.LocalDate;

public class Ex_04_Encapsulation_and_Information_Hiding {

    public static void main(String[] args) {

        //Encapsulation - bundling of fields and methods inside a single class (classes.Student Class)

        //create a new classes.Student object, passing values in via the Constructor
        Student stu = new Student("Wilma", "Flintstone", LocalDate.parse("2001-03-04"));

        //information hiding - prevents outer classes from accessing and changing fields and methods of a class
        int age = stu.getAge();

        System.out.println("classes.Student is " + age + " Years Old");
    }
}
