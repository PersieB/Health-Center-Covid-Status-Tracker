/*
 *Name: Percy Brown
 *Date: 22nd May 2020.
 */

/*
*Main class for all
* Creates 10 students; 5 Ghanaian and 5 foreigners
* Creates 2 threads
* Prints status of the students.
 */
public class Test_All {
    public static void main(String[] args){
    /* Creating the nurse */
        Chief_Nursing_Officer CHO = new Chief_Nursing_Officer("Deborah Frimpong", 201,
                "+2335 0241 4130", "deborah.frimpong@ashesi.edu.gh");

        /* Treatment takes the collection of students from the chief nursing officer class */
        Testing_Authority treatment = new Testing_Authority(CHO.getStud_Collection());

        /* Creates 5 Ghanaian students */
        Student_in_Ghana s1 = new Student_in_Ghana("Burtina Graham", "burtina.graham@ashesi.edu.gh",
                20, 40382022, Student.origin.GHANA, Student.major.BA, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "Spintex", "Greater Accra", 101);

        Student_in_Ghana s2 = new Student_in_Ghana("Denise Direnkyi", "denise.direnkyi@ashesi.edu.gh",
                20, 11242022, Student.origin.GHANA, Student.major.BA, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "Kwabenya", "Eastern", 201);

        Student_in_Ghana s3 = new Student_in_Ghana("Daniella Atidigah", "daniella.atidigah@ashesi.edu.gh",
                20, 71712022, Student.origin.GHANA, Student.major.BA, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "Tema", "Greater Accra", 301);

        Student_in_Ghana s4 = new Student_in_Ghana("Rosemond Tawiah", "rosemond.tawiah@ashesi.edu.gh",
                20, 23452022, Student.origin.GHANA, Student.major.EEE, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "Ashaiman", "Greater Accra", 401);

        Student_in_Ghana s5 = new Student_in_Ghana("Vanessa Adjei", "vanessa.adjei@ashesi.edu.gh",
                20, 4038, Student.origin.GHANA, Student.major.BA, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "Spintex", "Greater Accra", 01232022);


        /* Creates 5 Non-Ghanaian students */
        Student_outside_Ghana s6 = new Student_outside_Ghana("Ines Karita", "ines.karita@ashesi.edu.gh",
                20, 56782022, Student.origin.OUTSIDE_GHANA, Student.major.MIS, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "RWANDA", 101, 222);

        Student_outside_Ghana s7 = new Student_outside_Ghana("Daphne Chibesi", "chibesi@ashesi.edu.gh",
                22, 52342022, Student.origin.OUTSIDE_GHANA, Student.major.BA, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "CAMEROON", 201, 333);

        Student_outside_Ghana s8 = new Student_outside_Ghana("Carole Gaturo", "carole.gaturo@ashesi.edu.gh",
                21, 21112022, Student.origin.OUTSIDE_GHANA, Student.major.MIS, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "RWANDA", 301, 444);

        Student_outside_Ghana s9 = new Student_outside_Ghana("Princesse Lisa", "lisa@ashesi.edu.gh",
                23, 66662022, Student.origin.OUTSIDE_GHANA, Student.major.MIS, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "RWANDA", 401, 555);

        Student_outside_Ghana s10 = new Student_outside_Ghana("Prudence Wangari", "wangari@ashesi.edu.gh",
                21, 99992022, Student.origin.OUTSIDE_GHANA, Student.major.MIS, Student.health_status.NEGATIVE,
                Student.gender.FEMALE, "KENYA", 501, 666);

        /* Adds all students into the collection in the chief nursing officer class */
        CHO.addStudents_into_Collection(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);

        /* Threads for TestingInsideGhana & TestingOutsideGhana */
        Thread t_one = new Thread(treatment.getOgh());
        Thread t_two = new Thread(treatment.getGh());

        /* Starting threads */
        t_one.start();
        t_two.start();

        /* Be safe and prevent interruptions */
        try{
            t_one.join();
            t_two.join();
        }catch(InterruptedException x){
            System.out.println("Threads have been interrupted");
        }
        System.out.println();
        /* Prints the nurse's recommendation */
        CHO.check_health();

        /*
        * KEY JUSTIFICATIONS
        * An arraylist was used as the collection to take all students, mainly because it is resizable
        * In Student class,Ghanaians have origin set to GHANA (enum),
        *  while origin is set to OUTSIDE_GHANA (enum) for foreign students to differentiate
         */
    }
}
