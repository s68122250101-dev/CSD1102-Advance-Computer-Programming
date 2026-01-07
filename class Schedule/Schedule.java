public class Schedule {

    public static int scheduleCount = 0;

    private String day;
    private String startTime;
    private String endTime;

    public Schedule() {
        scheduleCount++;
    }

    public Schedule(String day, String startTime, String endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        scheduleCount++;
    }

    public String getDay() { return day; }
    public void setDay(String day) { this.day = day; }

    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }

    public void printInfo() {
        System.out.println("Day        : " + day);
        System.out.println("Start Time : " + startTime);
        System.out.println("End Time   : " + endTime);
        System.out.println("--------------------------------");
    }
}
