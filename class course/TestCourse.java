public class TestCourse {
    public static void main(String[] args) {

        Course c1 = new Course("CS101", "Programming I", 3);
        Course c2 = new Course();
        c2.setCourseId("CS102");
        c2.setCourseName("Data Structures");
        c2.setCredit(3);

        c1.printInfo();
        c2.printInfo();

        System.out.println("Total Courses: " + Course.courseCount);
    }
}
