public class TestInstructor {
    public static void main(String[] args) {

        Instructor i1 = new Instructor("T100", "Dr.Prasert", "CS");
        Instructor i2 = new Instructor();
        i2.setInstructorId("T200");
        i2.setName("Mr.Somsak");
        i2.setDepartment("IT");

        i1.printInfo();
        i2.printInfo();

        System.out.println("Total Instructors: " + Instructor.instructorCount);
    }
}
