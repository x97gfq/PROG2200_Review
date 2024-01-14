package classes2;

import java.time.LocalDate;
import java.time.Period;

public class Student implements Person {

    public Student(String fname, String lname, LocalDate dob) {
        first_name = fname;
        last_name = lname;
        date_of_birth = dob;
    }

    private final String first_name;
    private final String last_name;
    private final LocalDate date_of_birth;

    public String GetFullName() {
        return first_name + " " + last_name;
    }

    public int GetAge() {
        LocalDate curr_date = LocalDate.now();
        Period period = date_of_birth.until(curr_date);
        int years_between = period.getYears();
        return years_between;
    }
}
