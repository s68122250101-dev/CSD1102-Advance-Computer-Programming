import java.util.Date;

public class TestEnrollment {
    public static void main(String[] args) {

        Student s = new Student("65123456", "Chotipan", "CS", 20);
        Course c = new Course("CS101", "Programming I", 3);
        Instructor i = new Instructor("T100", "Dr.Prasert", "CS");
        Schedule sch = new Schedule("Monday", "09:00", "12:00");
        Section sec = new Section("S01", c, i, sch, "Room 101");

        Enrollment e1 = new Enrollment(s, sec, new Date());

        Enrollment e2 = new Enrollment();
        e2.setStudent(s);
        e2.setSection(sec);
        e2.setEnrollDate(new Date());

        e1.printInfo();
        e2.printInfo();

        System.out.println("Total Enrollments: " + Enrollment.enrollmentCount);
    }
}
