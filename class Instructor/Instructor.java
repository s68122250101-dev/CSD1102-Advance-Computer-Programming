public class Instructor {

    public static int instructorCount = 0;

    private String instructorId;
    private String name;
    private String department;

    public Instructor() {
        instructorCount++;
    }

    public Instructor(String instructorId, String name, String department) {
        this.instructorId = instructorId;
        this.name = name;
        this.department = department;
        instructorCount++;
    }

    public String getInstructorId() { return instructorId; }
    public void setInstructorId(String instructorId) { this.instructorId = instructorId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public void printInfo() {
        System.out.println("Instructor ID : " + instructorId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("--------------------------------");
    }
}
