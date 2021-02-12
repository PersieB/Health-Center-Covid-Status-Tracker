/*
 *Name: Percy Brown
 *Date: 22nd May 2020.
 */

import java.util.ArrayList;
import java.util.Objects;

/*
* Chief Nursing Officer Class
* Adds students to collection
* Checks student's health status and gives feedback
*/
public class Chief_Nursing_Officer {
    /* Instance variables */
    private String name;
    private int ID_number;
    private String contact_number;
    private String email_address;
    private ArrayList<Student> Stud_Collection;

    /* Default constructor */
    public Chief_Nursing_Officer(){
    }

    /* Overloaded constructor */
    public Chief_Nursing_Officer(String name, int ID_number, String contact_number, String email_address) {
        this.name = name;
        this.ID_number = ID_number;
        this.contact_number = contact_number;
        this.email_address = email_address;
        this.Stud_Collection = new ArrayList<>();
    }

    /* Overloaded constructor */
    public Chief_Nursing_Officer(String name, int ID_number, String contact_number, String email_address, ArrayList<Student> stud_Collection) {
        this.name = name;
        this.ID_number = ID_number;
        this.contact_number = contact_number;
        this.email_address = email_address;
        this.Stud_Collection = stud_Collection;
    }

    /* getter for name variable */
    public String getName() {
        return name;
    }

    /* setter for name variable */
    public void setName(String name) {
        this.name = name;
    }

    /* getter for ID variable */
    public int getID_number() {
        return ID_number;
    }

    /* setter for ID variable */
    public void setID_number(int ID_number) {
        this.ID_number = ID_number;
    }

    /* getter for contact variable */
    public String getContact_number() {
        return contact_number;
    }

    /* setter for contact variable */
    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    /* getter for email variable */
    public String getEmail_address() {
        return email_address;
    }

    /* setter for email variable */
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    /* getter for collections variable */
    public ArrayList<Student> getStud_Collection() {
        return Stud_Collection;
    }
    /* setter for collections variable */
    public void setStud_Collection(ArrayList<Student> stud_Collection) {
        Stud_Collection = stud_Collection;
    }

    /* equals method */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chief_Nursing_Officer that = (Chief_Nursing_Officer) o;
        return ID_number == that.ID_number &&
                Objects.equals(name, that.name) &&
                Objects.equals(contact_number, that.contact_number) &&
                Objects.equals(email_address, that.email_address) &&
                Objects.equals(Stud_Collection, that.Stud_Collection);
    }

    /* hashCode method */
    @Override
    public int hashCode() {
        return Objects.hash(name, ID_number, contact_number, email_address, Stud_Collection);
    }

    /* toString */
    @Override
    public String toString() {
        return "Chief_Nursing_Officer{" +
                "name='" + name + '\'' +
                ", ID_number=" + ID_number +
                ", contact_number='" + contact_number + '\'' +
                ", email_address='" + email_address + '\'' +
                ", Stud_Collection=" + Stud_Collection +
                '}';
    }

    /*
    * This method adds students into the collection
    * Many students can be added at a go.
    */
    public void addStudents_into_Collection(Student...student_list){
        for(Student ch: student_list){
            Stud_Collection.add(ch);
        }
    }

    public void addStudents_into_Collection(ArrayList<Student> all_students){
        for(Student ch: all_students){
            Stud_Collection.add(ch);
        }
    }

    /*
    * Nurse checks the test results of a student
    * Prints feedback; whether to report to school or seek treatment first
     */
    public void check_health(){
        System.out.println("Resume School Feedback - Updates");
        for(int i = 0; i < Stud_Collection.size(); i++){
            if(Stud_Collection.get(i).getTest() == Student.health_status.NEGATIVE){
                System.out.println("Perfect! We expect to see " +  Stud_Collection.get(i).getName()+
                        " on campus by 7th September 2020.");
            }
            else{
                System.out.println("Dear " + Stud_Collection.get(i).getName() +
                        ", kindly seek urgent treatment before December 7 2020.");
            }
        }
    }
}
