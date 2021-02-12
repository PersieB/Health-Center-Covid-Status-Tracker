/*
 *Name: Percy Brown
 *Date: 22nd May 2020.
 */
import java.util.*;

/*
*Testing Authority class
*Contains 2 classes
 */
public class Testing_Authority {
    //attribute
    private ArrayList<Student> ten_students;      //collection of all 10 students

    private TestingInsideGhana gh = new TestingInsideGhana();
    private TestingOutsideGhana ogh = new TestingOutsideGhana();

    /* Overloaded constructor */
    public Testing_Authority(ArrayList<Student> ten_students) {
        this.ten_students = ten_students;
    }

    /* getter for students collection variable */
    public ArrayList<Student> getTen_students() {
        return ten_students;
    }

    /* setter for students collection variable */
    public void setTen_students(ArrayList<Student> ten_students) {
        this.ten_students = ten_students;
    }

    /* getter for Ghana test object */
    public TestingInsideGhana getGh() {
        return gh;
    }

    /* getter for Ghana test object  */
    public void setGh(TestingInsideGhana gh) {
        this.gh = gh;
    }

    /* getter for foreign test object  */
    public TestingOutsideGhana getOgh() {
        return ogh;
    }

    /* getter for foreign test object  */
    public void setOgh(TestingOutsideGhana ogh) {
        this.ogh = ogh;
    }

    //creates instance of random class
    Random rand = new Random();

    /*
    *Test inside Ghana class
    * Randomly assigns status to students
    * Prints the student's status
     */
    class TestingInsideGhana implements Runnable{
        public void run(){
            for(int i = 0; i < ten_students.size(); i++){
                if(ten_students.get(i).getPlace() == Student.origin.GHANA){
                    int random_number = rand.nextInt(2);
                    if(random_number == 0){
                        ten_students.get(i).setTest(Student.health_status.POSITIVE);
                        System.out.println(ten_students.get(i).getName() + "'s test is " + ten_students.get(i).getTest());
                    }
                    else{
                        ten_students.get(i).setTest(Student.health_status.NEGATIVE);
                        System.out.println(ten_students.get(i).getName() + "'s test is " + ten_students.get(i).getTest());
                    }
                }
            }
        }
    }

    /*Test outside Ghana class
    * Randomly assigns status to students
    * Prints the student's status
    */
    class TestingOutsideGhana implements Runnable{
        public void run(){
            for(int i = 0; i < ten_students.size(); i++){
                if(ten_students.get(i).getPlace() == Student.origin.OUTSIDE_GHANA){
                    int random_number = rand.nextInt(2);
                    if(random_number == 0){
                        ten_students.get(i).setTest(Student.health_status.POSITIVE);
                        System.out.println(ten_students.get(i).getName() + "'s test is " + ten_students.get(i).getTest());
                    }
                    else{
                        ten_students.get(i).setTest(Student.health_status.NEGATIVE);
                        System.out.println(ten_students.get(i).getName() + "'s test is " + ten_students.get(i).getTest());
                    }
                }
            }
        }
    }
}

