public class StudentTesting{
    public static void main(String[] args) {
        Student student = new Student("Bidhan", "Thapa", 235905830);

        student.setMajor("Computer Science");
        student.setcredits(15);
        
        //Interface:
        System.out.println();
        System.out.println("*****STUDENT DETAILS*****");
        System.out.println();
        System.out.println("Student Name: " + student.getFullName());
        System.out.println("Student number: " + student.getStudentNumber());
        System.out.println("Major:" + student.getMajor());
        System.out.println("Total Credits: " + student.getcredits() + " credits\n");
        
        // Enroll in courses
        student.enrollMe("COSC 1046");
        student.enrollMe("ENGL 1801");
        student.enrollMe("MATH 1056");
        student.enrollMe("ECON 1006");
        student.enrollMe("ECON 1007\n");
        
        // Differ from course
        student.unenrollMe("ECON 1007");
        System.out.println("Total Credits after withdrawal: 12 credits\n");

        System.out.println("This information is created on: "+ student.getDateCreated());
   }
}

