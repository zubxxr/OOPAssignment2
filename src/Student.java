import java.util.Vector;

public class Student {
    private String id;
    private String name;
    private Vector courses = new Vector(); // contains all courses the student is registered in

    /**
     * constructs student using name and id
     * @param stdName
     * @param stdId
     */
    public Student(String stdName, String stdId) {
        this.name = stdName;
        this.id = stdId;
    }

    /**
     * gets name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * gets id
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * returns id, name and student's registered courses
     * @return
     */
    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        return id + " " + name + " Registered courses: " + courses;
    }

    /**
     * registers a student in the given course
     * also restricts the course information given
     * to course code and number
     * @param course
     */
    public void registerFor(Course course){
        course.registerStudentIntoCourse(this, course);
        courses.add(course.toString().substring(0, 10));
    }

    /**
     * calls method from course and passes the given course
     * and student calling the method into that method
     * @param course
     * @return
     */
    public boolean isRegisteredInCourse(Course course) {
        return course.checkForStudentInCourse(this);
    }
}