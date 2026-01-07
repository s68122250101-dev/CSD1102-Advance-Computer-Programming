public class Course {

    public static int courseCount = 0;

    private String courseId;
    private String courseName;
    private int credit;

    public Course() {
        courseCount++;
    }

    public Course(String courseId, String courseName, int credit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        courseCount++;
    }

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getCredit() { return credit; }
    public void setCredit(int credit) { this.credit = credit; }

    public void printInfo() {
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Credits     : " + credit);
        System.out.println("--------------------------------");
    }
}
