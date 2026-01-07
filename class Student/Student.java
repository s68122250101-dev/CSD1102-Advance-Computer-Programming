public class Student {

    public static int studentCount = 0;

    private String studentID;
    private String name;
    private String major;
    private int age;

    public Student() {
        studentCount++;
    }

    public Student(String studentID, String name, String major, int age) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.age = age;
        studentCount++;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void printInfo() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name       : " + name);
        System.out.println("Major      : " + major);
        System.out.println("Age        : " + age);
        System.out.println("--------------------------------");
    }
}
