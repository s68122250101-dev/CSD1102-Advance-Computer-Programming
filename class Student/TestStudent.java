public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("65123456", "Chotipan", "CS", 20);
        Student s2 = new Student();
        s2.setStudentID("66001111");
        s2.setName("Piyawat");
        s2.setMajor("computer ");
        s2.setAge(18);

        s1.printInfo();
        s2.printInfo();

        System.out.println("Total Students: " + Student.studentCount);
    }
}
