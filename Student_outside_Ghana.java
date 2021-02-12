/*
 *Name: Percy Brown
 *Date: 22nd May 2020.
 */
import java.util.Objects;

/*
* Class for foreign students
 */
public class Student_outside_Ghana extends Student{
    /* Instance variables */
    private String country_name;
    private int country_nat_id;
    private int passport_ID;

    /* Default constructor */
    public Student_outside_Ghana(){
    }

    /* Overloaded Constructors - inheriting from Student class */
    public Student_outside_Ghana(String name, String email_address, int age, int ID_number, origin place,
                                 major bsc, health_status test, Student.gender gender) {
        super(name, email_address, age, ID_number, place, bsc, test, gender);
    }

    /* Overloaded Constructors - with additional instance variables for Ghanaian students */
    public Student_outside_Ghana(String name, String email_address, int age, int ID_number, origin place, major bsc,
                                 health_status test, Student.gender gender, String country_name, int country_nat_id,
                                 int passport_ID) {
        super(name, email_address, age, ID_number, place, bsc, test, gender);
        this.country_name = country_name;
        this.country_nat_id = country_nat_id;
        this.passport_ID = passport_ID;
    }

    /* getter for country variable */
    public String getCountry_name() {
        return country_name;
    }

    /* setter for country variable */
    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    /* getter for country id variable */
    public int getCountry_nat_id() {
        return country_nat_id;
    }

    /* setter for country id variable */
    public void setCountry_nat_id(int country_nat_id) {
        this.country_nat_id = country_nat_id;
    }

    /* getter for passport id variable */
    public int getPassport_ID() {
        return passport_ID;
    }

    /* setter for passport id variable */
    public void setPassport_ID(int passport_ID) {
        this.passport_ID = passport_ID;
    }

    /* equals method */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student_outside_Ghana that = (Student_outside_Ghana) o;
        return passport_ID == that.passport_ID &&
                Objects.equals(country_name, that.country_name) &&
                Objects.equals(country_nat_id, that.country_nat_id);
    }

    /* hashCode method */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), country_name, country_nat_id, passport_ID);
    }

    /* toString method */
    @Override
    public String toString() {
        return "Student_outside_Ghana{" +
                "country_name='" + country_name + '\'' +
                ", country_nat_id='" + country_nat_id + '\'' +
                ", passport_ID=" + passport_ID +
                '}';
    }
}
