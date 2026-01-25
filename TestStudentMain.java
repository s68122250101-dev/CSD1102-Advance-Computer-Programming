public class TestStudentMain {
    public static void main(String[] args) {

        Student s1 = new Student("65123456", "Chotipan", "Computer Science", 3.45);
        Student s2 = new Student("65123457", "Ada", "Information Technology", 3.80);
        s1.displayInfo();
        s2.displayInfo();

        Student[] students = new Student[3];
        students[0] = new Student("65123458", "Somchai", "Software Engineering", 3.20);
        students[1] = new Student("65123459", "Piyawat", "Computer Science", 3.65);
        students[2] = new Student("65123460", "Nawatakorn", "Data Science", 3.90);


        System.out.println("Student List ");
        for (Student s : students) {
            s.displayInfo();
        }
    }
}
