import java.util.Vector;

public class Course {

    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList = new Vector<Student>(); // contains all students registered in this course

    /**
     * constructor to initialize a course using its code,
     * number, dept and title
     * @param code
     * @param number
     * @param dept
     * @param title
     */
    public Course(String code, int number, Department dept, String title) {
        // also initialize the classList;
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title=title;
    }

    /**
     * returns the code, number, title and number of students of course
     * @return
     */
    public String toString() {
        return code + " " + number + " " + title +
                ", Enrollment = " + classList.size();
    }

    /**
     * registers student into course by adding student into class list
     * @param student
     * @param course
     */
    public void registerStudentIntoCourse(Student student, Course course){
        course.classList.add(student);
    }


    /**
     * checks for student in course
     * @param student
     * @return
     */
    public boolean checkForStudentInCourse(Student student){
        if (classList.contains(student)) {
            return true;
        }
        else{
            return false;
        }
    }
}