import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {

        
        Student s1 = new Student("65123456", "Chotipan", "CS", 20);

        Student s2 = new Student();

        s2.setId("68122250101");
        s2.setName("Piyawat");
        s2.setMajor("comsince");
        s2.setAge(18);

        
        System.out.println("Student 1: " + s1.getId() + " - " + s1.getName());
        System.out.println("Student 2: " + s2.getId() + " - " + s2.getName());
    }
}
