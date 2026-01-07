public class Section {

    public static int sectionCount = 0;

    private String sectionID;
    private Course course;
    private Instructor instructor;
    private Schedule schedule;
    private int maxSeats;

    // Constructor 1
    public Section() {
        sectionCount++;
    }

    // Constructor 2
    public Section(String sectionID, Course course, Instructor instructor, Schedule schedule, int maxSeats) {
        this.sectionID = sectionID;
        this.course = course;
        this.instructor = instructor;
        this.schedule = schedule;
        this.maxSeats = maxSeats;
        sectionCount++;
    }

    // Getter / Setter
    public String getSectionID() { return sectionID; }
    public void setSectionID(String sectionID) { this.sectionID = sectionID; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public Schedule getSchedule() { return schedule; }
    public void setSchedule(Schedule schedule) { this.schedule = schedule; }

    public int getMaxSeats() { return maxSeats; }
    public void setMaxSeats(int maxSeats) { this.maxSeats = maxSeats; }
}
