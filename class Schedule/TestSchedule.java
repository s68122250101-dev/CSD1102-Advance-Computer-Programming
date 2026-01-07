public class TestSchedule {
    public static void main(String[] args) {

        Schedule sch1 = new Schedule("Monday", "09:00", "12:00");
        Schedule sch2 = new Schedule();
        sch2.setDay("Friday");
        sch2.setStartTime("13:00");
        sch2.setEndTime("16:00");

        sch1.printInfo();
        sch2.printInfo();

        System.out.println("Total Schedules: " + Schedule.scheduleCount);
    }
}
