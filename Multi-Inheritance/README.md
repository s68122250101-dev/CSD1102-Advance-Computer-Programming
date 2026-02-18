# Rescue Robot Project

## รายละเอียดโครงการ
โปรเจกต์นี้แสดงแนวคิด **Multiple Inheritance ใน Java**
โดยใช้แนวทาง **Interface + Composition** แทนการสืบทอดหลาย class

Java ไม่อนุญาตให้ class หนึ่ง extends ได้มากกว่า 1 class  
ดังนั้นผมจึงออกแบบระบบให้:

- ใช้ interface รวม “ความสามารถ”
- ใช้ composition รวม “ระบบย่อย”


## คุณสมบัติของระบบ (Features)

- Fly capability (บินได้)
- Move capability (เคลื่อนที่ได้)
- Thermal detection (ตรวจจับความร้อน)
- Communication system (ส่งข้อความพร้อมพิกัด)
- Battery management (จัดการพลังงาน)

---

## โครงสร้างการออกแบบ (Design Concept)

### 1 ทำไม Java สืบทอดหลาย class ไม่ได้?

Java ป้องกันปัญหา **Diamond Problem**

ตัวอย่างปัญหา:
ถ้า Class A มี method ชื่อเดียวกัน  
Class B และ C สืบทอดจาก A  
แล้ว Class D สืบทอดจาก B และ C  

จะไม่สามารถตัดสินใจได้ว่า D ควรใช้ method ของ B หรือ C

ดังนั้น Java จึง:
- อนุญาตให้ extends ได้เพียง 1 class
- แต่ implements ได้หลาย interface

---

### 1 เราใช้ Interface + Composition แทนอย่างไร?

####  Interface -> รวมความสามารถ

RescueRobot implements:

- Flyable
- Movable
- Communicable
- Detectable

ตัวอย่าง:

```java
public class RescueRobot 
    implements Flyable, Movable, Communicable, Detectable
