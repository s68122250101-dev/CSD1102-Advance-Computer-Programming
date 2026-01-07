import java.util.Date;

public class Enrollment {

    public static int enrollmentCount = 0;

    private Student student;
    private Section section;
    private Date enrollDate;

    public Enrollment() {
        enrollmentCount++;
    }

    public Enrollment(Student student, Section section, Date enrollDate) {
        this.student = student;
        this.section = section;
        this.enrollDate = enrollDate;
        enrollmentCount++;
    }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Section getSection() { return section; }
    public void setSection(Section section) { this.section = section; }

    public Date getEnrollDate() { return enrollDate; }
    public void setEnrollDate(Date enrollDate) { this.enrollDate = enrollDate; }

    public void printInfo() {
        System.out.println("Enrollment Info");
        System.out.println("Student : " + student.getName());
        System.out.println("Section : " + section.getSectionId());
        System.out.println("Date    : " + enrollDate);
        System.out.println("--------------------------------");
    }
}
