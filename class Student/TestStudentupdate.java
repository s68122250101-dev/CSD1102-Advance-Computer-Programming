public class TestStudentupdate {
    public static void main(String[] args) {

        try {

            Student s1 = new Student("65123456", "Chotipan", "CS", 20);

            Student s2 = new Student();
            s2.setStudentID("66001111");
            s2.setName("Piyawat");
            s2.setMajor("computer");
            s2.setAge(18);

            s1.printInfo();
            s2.printInfo();

            System.out.println("Total Students: "
                    + Student.studentCount);

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

            System.out.println("End of TestStudent");

        }

    }
}