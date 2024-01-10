import java.util.Date;

public class Student { //A class named Student is created

    //variables
    private int studentNumber;
    private String major;
    private String firstName;
    private String lastName;
    private int credits = 0;
    private Date dateCreated;
    private String[] courses = new String[5];
    
    //A constructor
    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        dateCreated = new Date();
    }
    

    //Method to enroll in course
    public void enrollMe(String course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                System.out.println("You have enrolled in " + course);
                return;
            }
        }
        System.out.println("You cannot enroll in more than " + courses.length + " courses");
    }

    public void unenrollMe(String course) {
        for (int i = 0; i < courses.length; i++) {
            if (course.equals(courses[i])) {
                courses[i] = null;
                // System.out.println(" You are no longer enrolled in " + course);
                return;
            }
        }
        System.out.println("You are no longer enrolled in " + course);
    }

    // Accesor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }
    
    //mutator
    public void setcredits(int credits){
        this.credits = credits;
    }

    public int getcredits(){
        return credits;
    }

    public int getStudentNumber(){
        return studentNumber;
    }
    
    //mutator
    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

