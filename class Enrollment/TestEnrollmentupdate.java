import java.util.Date;

public class TestEnrollmentupdate {
    public static void main(String[] args) {

        try {

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

            System.out.println("Total Enrollments: "
                    + Enrollment.enrollmentCount);

        }

        catch (NullPointerException e) {

            System.out.println("Null Pointer Error");
            System.out.println(e);

        }

        catch (Exception e) {

            System.out.println("General Error");
            System.out.println(e);

        }

        finally {

            System.out.println("End of TestEnrollment");

        }

    }
}