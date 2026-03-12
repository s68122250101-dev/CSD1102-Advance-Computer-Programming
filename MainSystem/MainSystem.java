import java.util.Date;

public class MainSystem {

    public static void main(String[] args) {

        try {

            System.out.println("===== REGISTRATION SYSTEM =====");

            Student stu1 =
                    new Student("65123456", "Chotipan", "CS", 20);

            Course course1 =
                    new Course("CS101", "Programming I", 3);

            Instructor ins1 =
                    new Instructor("T100", "Dr.Prasert", "CS");

            Schedule sch1 =
                    new Schedule("Monday", "09:00", "12:00");

            Section sec1 =
                    new Section(
                            "S01",
                            course1,
                            ins1,
                            sch1,
                            "Room 101"
                    );

            Enrollment en1 =
                    new Enrollment(
                            stu1,
                            sec1,
                            new Date()
                    );

            Payment pay1 =
                    new Payment(
                            "P001",
                            1500,
                            "Mobile Banking"
                    );

            System.out.println("\n--- Student ---");
            stu1.printInfo();

            System.out.println("\n--- Course ---");
            course1.printInfo();

            System.out.println("\n--- Instructor ---");
            ins1.printInfo();

            System.out.println("\n--- Schedule ---");
            sch1.printInfo();

            System.out.println("\n--- Section ---");
            sec1.printInfo();

            System.out.println("\n--- Enrollment ---");
            en1.printInfo();

            System.out.println("\n--- Payment ---");
            pay1.printInfo();

            System.out.println("\n===== COUNT =====");

            System.out.println("Students: "
                    + Student.studentCount);

            System.out.println("Courses: "
                    + Course.courseCount);

            System.out.println("Sections: "
                    + Section.sectionCount);

            System.out.println("Enrollments: "
                    + Enrollment.enrollmentCount);

            System.out.println("Payments: "
                    + Payment.paymentCount);

        }

        catch (Exception e) {

            System.out.println("System Error");
            e.printStackTrace();

        }

        finally {

            System.out.println("\n===== END SYSTEM =====");

        }

    }
}