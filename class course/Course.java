public class Course {

    public static int courseCount = 0;

    private String courseID;
    private String courseName;
    private int credit;

    // Constructor 1
    public Course() {
        courseCount++;
    }

    // Constructor 2
    public Course(String courseID, String courseName, int credit) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credit = credit;
        courseCount++;
    }

    // Getter / Setter
    public String getCourseID() { return courseID; }
    public void setCourseID(String courseID) { this.courseID = courseID; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getCredit() { return credit; }
    public void setCredit(int credit) { this.credit = credit; }
}
