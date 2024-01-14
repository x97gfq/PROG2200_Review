package classes;

import java.time.LocalDate;
import java.time.Period;

//new Class classes.Student with Two Constructors and a toString method.
public class Student {

    public Student() {
    }

    public Student(String fname, String lname, LocalDate dob) {
        first_name = fname;
        last_name = lname;
        date_of_birth = dob;
    }

    public Student(String fname, String lname) {
        first_name = fname;
        last_name = lname;
    }

    private String first_name;
    private String last_name;
    private LocalDate date_of_birth;

    public String getFirstName() {
        return first_name;
    }
    public void setFirstName(String fname) {
        this.first_name = fname;
    }

    public String getLastName() {
        return last_name;
    }
    public void setLastName(String fname) {
        this.last_name = fname;
    }

    public void setDob(LocalDate dob) {
        this.date_of_birth = dob;
    }

    public int getAge() {
        LocalDate curr_date = LocalDate.now();
        Period period = date_of_birth.until(curr_date);
        return period.getYears();
    }

    public String toString() {
        return "Name: " + this.first_name + " " + this.last_name;
    }
}