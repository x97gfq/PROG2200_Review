import java.time.LocalDate;

public class Ex_06_Interfaces {

    public static void main(String[] args) {
        classes2.Student stu = new classes2.Student("Fred", "Flintsone", LocalDate.parse("2001-03-04"));

        String name = stu.GetFullName();
        int age = stu.GetAge();

        System.out.println("Name: " + name + ", Age: " + age);
    }
}