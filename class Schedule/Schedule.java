public class Schedule {

    public static int scheduleCount = 0;

    private String day;
    private String startTime;
    private String endTime;
    private String room;

    // Constructor 1
    public Schedule() {
        scheduleCount++;
    }

    // Constructor 2
    public Schedule(String day, String startTime, String endTime, String room) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        scheduleCount++;
    }

    // Getter / Setter
    public String getDay() { return day; }
    public void setDay(String day) { this.day = day; }

    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }

    public String getRoom() { return room; }
    public void setRoom(String room) { this.room = room; }
}
