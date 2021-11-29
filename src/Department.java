import java.util.Vector;

public class Department {

    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList = new Vector<Course>(); // all courses offered by the department
    private Vector<Student> registerList = new Vector<Student>(); // all students taking courses in the department.

    /**
     * Constructs and initializes a department using name and id
     * @param name
     * @param id
     */
    public Department(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     *getter for dept name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * getter for dept id
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * returns the name, number of courses, and number of students of department
     * @return
     */
    public String toString() {
        return name + ": " + courseList.size() + " courses, "
                + registerList.size() + " students";
    }

    /**
     * adds a course to the department course list
     * if the course is already added, it won't add it again
     * @param course
     */
    public void offerCourse(Course course){
        if(!courseList.contains(course))
        courseList.add(course);
    }

    /**
     * displays all courses offered by the department
     */
    public void printCoursesOffered(){
        for(int i = 0; i < courseList.size(); i++)
        System.out.println(courseList.elementAt(i));
    }

    /**
     * prints out all students registered in department
     */
    public void printStudentsByName() {
        for(Student student: registerList)
            System.out.println(student.toString());
    }

    /**
     * registers a course and adds the student
     * into the department
     * if the student or course are already inside the department
     * they will not be added
     * @param student
     * @param course
     */
    public void registerStudentCourseInDepartment(Student student, Course course){
        if(!registerList.contains(student))
            registerList.add(student);

        if(!courseList.contains(course))
            courseList.add(course);
    }

    /**
     * checks to see if a student is registered in the department
     * @param student
     * @return
     */
    public boolean isStudentRegistered(Student student){
        if(registerList.contains(student))
            return true;
        else
            return false;
    }
}