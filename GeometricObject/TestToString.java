public class TestToString {
    private String name;
    public TestToString(){}
    public TestToString(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        TestToString t1 = new TestToString("John");
        System.out.println(t1.toString());
    }
    public String toString() {
        return "created on "+name;
    }
}

/* to String ( ) -> Object #แสดง address ที่ object อยู่
                 -> rewrite #แสดงให้ user เข้าใจ 
                 
                 
this -> this() ->เรียก Contructor ตัวเอง
     -> เรียกตัวแปร , method

blinding -> ลูก -> เรียก Contructor พ่อ () no parametor

Override ถ้า method พ่อ private Override ไม่ได้

ToString -> Return ค่า Object


instanceof ตรวจสอบ 
*/

