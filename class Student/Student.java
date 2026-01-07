public class Student {

    public static int studentCount = 0;

    private String studentID;
    private String name;
    private String major;
    private int age;

    // Constructor 1
    public Student() {
        studentCount++;
    }

    // Constructor 2
    public Student(String studentID, String name, String major, int age) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.age = age;
        studentCount++;
    }

    // Getter / Setter
    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
