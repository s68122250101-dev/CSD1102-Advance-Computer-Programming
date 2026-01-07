public class TestSection {
    public static void main(String[] args) {

        Course c = new Course("CS101", "Programming I", 3);
        Instructor ins = new Instructor("T100", "Dr.Prasert", "CS");
        Schedule sch = new Schedule("Monday", "09:00", "12:00");

        Section sec1 = new Section("S01", c, ins, sch, "Room 101");

        Section sec2 = new Section();
        sec2.setSectionId("S02");
        sec2.setCourse(c);
        sec2.setInstructor(ins);
        sec2.setSchedule(sch);
        sec2.setRoom("Room 202");

        sec1.printInfo();
        sec2.printInfo();

        System.out.println("Total Sections: " + Section.sectionCount);
    }
}
