public class Section {

    public static int sectionCount = 0;

    private String sectionId;
    private Course course;
    private Instructor instructor;
    private Schedule schedule;
    private String room;

    public Section() {
        sectionCount++;
    }

    public Section(String sectionId, Course course, Instructor instructor, Schedule schedule, String room) {
        this.sectionId = sectionId;
        this.course = course;
        this.instructor = instructor;
        this.schedule = schedule;
        this.room = room;
        sectionCount++;
    }

    public String getSectionId() { return sectionId; }
    public void setSectionId(String sectionId) { this.sectionId = sectionId; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public Schedule getSchedule() { return schedule; }
    public void setSchedule(Schedule schedule) { this.schedule = schedule; }

    public String getRoom() { return room; }
    public void setRoom(String room) { this.room = room; }

    public void printInfo() {
        System.out.println("Section ID : " + sectionId);
        System.out.println("Room       : " + room);
        System.out.println("Course     : " + course.getCourseName());
        System.out.println("Instructor : " + instructor.getName());
        System.out.println("Schedule   : " + schedule.getDay() + " " +
                           schedule.getStartTime() + "-" + schedule.getEndTime());
        System.out.println("--------------------------------");
    }
}
