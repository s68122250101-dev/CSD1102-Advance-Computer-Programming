public class TestScheduleupdate {
    public static void main(String[] args) {

        try {

            Schedule sch1 = new Schedule("Monday", "09:00", "12:00");

            Schedule sch2 = new Schedule();
            sch2.setDay("Friday");
            sch2.setStartTime("13:00");
            sch2.setEndTime("16:00");

            sch1.printInfo();
            sch2.printInfo();

            System.out.println("Total Schedules: "
                    + Schedule.scheduleCount);

        }

        catch (NullPointerException e) {

            System.out.println("Null Pointer Error");
            System.out.println(e);

        }

        catch (Exception e) {

            System.out.println("General Error");
            System.out.println(e);

        }

        finally {

            System.out.println("End of TestSchedule");

        }

    }
}