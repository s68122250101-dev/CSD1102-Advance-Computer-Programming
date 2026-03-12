public class TestInstructorupdate {
    public static void main(String[] args) {

        try {

            Instructor i1 = new Instructor("T100", "Dr.Prasert", "CS");

            Instructor i2 = new Instructor();
            i2.setInstructorId("T200");
            i2.setName("Mr.Somsak");
            i2.setDepartment("IT");

            i1.printInfo();
            i2.printInfo();

            System.out.println("Total Instructors: "
                    + Instructor.instructorCount);

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

            System.out.println("End of TestInstructor");

        }

    }
}