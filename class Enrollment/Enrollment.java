public class Enrollment {

    public static int enrollmentCount = 0;

    private String enrollmentID;
    private Student student;
    private Section section;

    // Constructor 1
    public Enrollment() {
        enrollmentCount++;
    }

    // Constructor 2
    public Enrollment(String enrollmentID, Student student, Section section) {
        this.enrollmentID = enrollmentID;
        this.student = student;
        this.section = section;
        enrollmentCount++;
    }

    // Getter / Setter
    public String getEnrollmentID() { return enrollmentID; }
    public void setEnrollmentID(String enrollmentID) { this.enrollmentID = enrollmentID; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Section getSection() { return section; }
    public void setSection(Section section) { this.section = section; }
}
