public class TestDriver {

    public static void main(String[] args) {

        //create a couple of departments
        Department ecse = new Department("Electrical, Computer and Software Engineering", "ECSE");
        Department amme = new Department("Automotive, Mechanical and Mane Engineering", "AMNE");

        //create some courses
        Course sofe2710 = new Course("SOFE", 2710, ecse, "Object Oriented Programming & Design");
        Course sofe2800 = new Course("SOFE", 2800, ecse, "Web Programming");
        Course sofe4610 = new Course("SOFE", 4610, ecse, "Internet of Things");
        Course elee4350 = new Course("ELEE", 4350, ecse, "Microprocessors");
        Course elee4150 = new Course("ELEE", 4150, ecse, "Advanced Control Systems");
        Course elee3250 = new Course("ELEE", 3250, ecse, "Electric Machines");
        Course engr1015 = new Course("ENGR", 1015, ecse, "Intro. to Engineering");

        Course mane2200 = new Course("MANE", 2200, amme, "3D Printing");
        Course mece3000 = new Course("MECE", 3000, amme, "Fluid Mechanics");
        Course aute3000 = new Course("AUTE", 3010, amme, "Intro. to Auto. Engineering");
        Course aute4010 = new Course("AUTE", 4010, amme, "Vehicle Dynamics & Control");

        //create some students
        Student joseph = new Student("100345876", "Joseph McDonald");
        Student emily = new Student("100234211", "Emily Lee");
        Student max = new Student("100988111", "Max McDee");
        Student jane = new Student("1004358888", "Jane Fraser");
        Student chad = new Student("1004358888", "Chad K.");

        //connect courses to departments
        ecse.offerCourse(sofe2710);
        ecse.offerCourse(sofe2800);
        ecse.offerCourse(sofe4610);
        ecse.offerCourse(elee4350);
        ecse.offerCourse(elee4150);
        ecse.offerCourse(elee3250);
        ecse.offerCourse(engr1015);

        amme.offerCourse(mane2200);
        amme.offerCourse(mece3000);
        amme.offerCourse(aute3000);
        amme.offerCourse(aute4010);

        //Student joseph
        joseph.registerFor(sofe2710); ecse.registerStudentCourseInDepartment(joseph,sofe2710);
        joseph.registerFor(sofe2800); ecse.registerStudentCourseInDepartment(joseph,sofe2800);
        joseph.registerFor(mane2200); amme.registerStudentCourseInDepartment(joseph,mane2200);

        //Student Emily
        emily.registerFor(sofe2710); ecse.registerStudentCourseInDepartment(emily,sofe2710);
        emily.registerFor(sofe2800); ecse.registerStudentCourseInDepartment(emily,sofe2800);

        //Student Max
        max.registerFor(mece3000);  amme.registerStudentCourseInDepartment(max,mece3000);
        max.registerFor(sofe2800);  ecse.registerStudentCourseInDepartment(max,sofe2800);
        max.registerFor(sofe4610);  ecse.registerStudentCourseInDepartment(max,sofe4610);
        max.registerFor(elee4150);  ecse.registerStudentCourseInDepartment(max,elee4150);

        //Student Jane
        jane.registerFor(sofe2710); ecse.registerStudentCourseInDepartment(jane,sofe2710);
        jane.registerFor(mece3000); amme.registerStudentCourseInDepartment(jane,mece3000);

        //Student Chad
        chad.registerFor(mece3000);   amme.registerStudentCourseInDepartment(chad,mece3000);
        chad.registerFor(aute4010);   amme.registerStudentCourseInDepartment(chad,aute4010);
        chad.registerFor(aute3000);   amme.registerStudentCourseInDepartment(chad,aute3000);
        chad.registerFor(mane2200);   amme.registerStudentCourseInDepartment(chad,mane2200);
        chad.registerFor(sofe2710);   ecse.registerStudentCourseInDepartment(chad,sofe2710);

        //now check to see if it works
        System.out.println("\nECSE Department: "+ ecse);
        System.out.println("\nAMME Department: "+ amme);

        System.out.println("\nECSE courses offered: ");
        ecse.printCoursesOffered();
        System.out.println("\nAMME courses offered: ");
        amme.printCoursesOffered();

        System.out.println("\nStudents taking ECSE courses: ");
        ecse.printStudentsByName();

        //prints out names of ppl in course
        System.out.println("\nStudents taking AMME courses: ");
        amme.printStudentsByName();

        System.out.println("\nIs Joseph registered in sofe2710: "+joseph.isRegisteredInCourse(sofe2710));
        System.out.println("Is Joseph registered in sofe2800: "+joseph.isRegisteredInCourse(sofe2800));
        System.out.println("Is max registered in mece3000: "+max.isRegisteredInCourse(mece3000));
        System.out.println("Is joseph registered in mane3000: "+joseph.isRegisteredInCourse(mece3000));

        System.out.println("\nJoseph is registered in ECSE: "+ecse.isStudentRegistered(joseph));

        System.out.println("Chad is registered in ECSE: "+ecse.isStudentRegistered(chad));

    }
}










