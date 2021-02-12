/*
*Name: Percy Brown
*Date: 22nd May 2020.
 */
import java.util.Objects;

/*
*Student Class
*Has instance variables
*Contains getters and setters of each instance variable
*Also has helper functions
*/
public class Student {
    /* variables of type enum */
    public enum gender{FEMALE, MALE};
    public enum origin{GHANA, OUTSIDE_GHANA};
    public enum health_status{NEGATIVE, POSITIVE};
    public enum major{EEE, ME, CE, CS, BA, MIS};

    /* instance variables */
    private String name;
    private String email_address;
    private int age;
    private int ID_number;
    private origin place;
    private major bsc;
    private health_status test;
    private gender gender;

    /* Default Constructor */
    public Student(){
    }

    /* Overloaded Constructor */
    public Student(String name, String email_address, int age, int ID_number, origin place, major bsc, health_status test, Student.gender gender) {
        this.name = name;
        this.email_address = email_address;
        this.age = age;
        this.ID_number = ID_number;
        this.place = place;
        this.bsc = bsc;
        this.test = test;
        this.gender = gender;
    }

    /* getter for name variable */
    public String getName() {
        return name;
    }

    /* setter for name variable */
    public void setName(String name) {
        this.name = name;
    }

    /* getter for email variable */
    public String getEmail_address() {
        return email_address;
    }

    /* setter for email variable */
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    /* getter for age variable */
    public int getAge() {
        return age;
    }

    /* setter for age variable */
    public void setAge(int age) {
        this.age = age;
    }

    /* getter for ID variable */
    public int getID_number() {
        return ID_number;
    }

    /* setter for ID variable */
    public void setID_number(int ID_number) {
        this.ID_number = ID_number;
    }

    /* getter for place variable */
    public origin getPlace() {
        return place;
    }

    /* setter for place variable */
    public void setPlace(origin place) {
        this.place = place;
    }

    /* getter for major variable */
    public major getBsc() {
        return bsc;
    }

    /* setter for major variable */
    public void setBsc(major bsc) {
        this.bsc = bsc;
    }

    public health_status getTest() {
        return test;
    }

    /* getter for name variable */
    public void setTest(health_status test) {
        this.test = test;
    }

    /* getter for name variable */
    public Student.gender getGender() {
        return gender;
    }

    /* getter for name variable */
    public void setGender(Student.gender gender) {
        this.gender = gender;
    }

    /* Equals method */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                ID_number == student.ID_number &&
                Objects.equals(name, student.name) &&
                Objects.equals(email_address, student.email_address) &&
                place == student.place &&
                bsc == student.bsc &&
                test == student.test &&
                gender == student.gender;
    }

    /* hashcode method*/
    @Override
    public int hashCode() {
        return Objects.hash(name, email_address, age, ID_number, place, bsc, test, gender);
    }

    /* toString method */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", age=" + age +
                ", ID_number=" + ID_number +
                ", place=" + place +
                ", bsc=" + bsc +
                ", test=" + test +
                ", gender=" + gender +
                '}';
    }
}
