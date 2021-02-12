/*
 *Name: Percy Brown
 *Date: 22nd May 2020.
 */

import java.util.Objects;

/*
* This class contains Ghanaian students
* Inherits from the Student class
 */
public class Student_in_Ghana extends Student{
    /* Instance variables */
    private String town_area;
    private String region;
    private int GH_ID;

    /* Default constructor */
    public Student_in_Ghana(){

    }
    /* Overloaded Constructors - inheriting from Student class */
    public Student_in_Ghana(String name, String email_address, int age, int ID_number, origin place, major bsc,
                            health_status test, Student.gender gender) {
        super(name, email_address, age, ID_number, place, bsc, test, gender);
    }
    /* Overloaded Constructors - with additional instance variables for Ghanaian students */
    public Student_in_Ghana(String name, String email_address, int age, int ID_number, origin place, major bsc,
                            health_status test, Student.gender gender, String town_area, String region, int GH_ID) {
        super(name, email_address, age, ID_number, place, bsc, test, gender);
        this.town_area = town_area;
        this.region = region;
        this.GH_ID = GH_ID;
    }

    /* getter for town variable */
    public String getTown_area() {
        return town_area;
    }

    /* setter for town variable */
    public void setTown_area(String town_area) {
        this.town_area = town_area;
    }

    /* getter for region variable */
    public String getRegion() {
        return region;
    }

    /* setter for region variable */
    public void setRegion(String region) {
        this.region = region;
    }

    /* getter for Ghana ID variable */
    public int getGH_ID() {
        return GH_ID;
    }

    /* getter for Ghana ID variable */
    public void setGH_ID(int GH_ID) {
        this.GH_ID = GH_ID;
    }

    /* equals object */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student_in_Ghana that = (Student_in_Ghana) o;
        return GH_ID == that.GH_ID &&
                Objects.equals(town_area, that.town_area) &&
                Objects.equals(region, that.region);
    }

    /* hash code method */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), town_area, region, GH_ID);
    }

    /* toString method */
    @Override
    public String toString() {
        return "Student_in_Ghana{" +
                "town_area='" + town_area + '\'' +
                ", region='" + region + '\'' +
                ", GH_ID=" + GH_ID +
                '}';
    }
}
