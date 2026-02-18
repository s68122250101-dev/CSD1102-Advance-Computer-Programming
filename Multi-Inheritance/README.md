# Assignment Title: Rescue Robot System (Interface + Composition)

## Student Information
- Name: Piyawat Meetee
- Student ID: [68122250101]
- Submission Date: [18/2/2026]


## Problem Description

ระบบนี้เป็นโปรแกรมจำลองหุ่นยนต์กู้ภัย (Rescue Robot)  
ที่สามารถบิน เคลื่อนที่ ตรวจจับความร้อน และส่งข้อความพร้อมพิกัดได้

### เป้าหมายของโปรแกรม
- ออกแบบระบบโดยใช้แนวคิด OOP
- แสดงการแก้ปัญหา Multiple Inheritance ใน Java
- ใช้ Interface + Composition แทนการสืบทอดหลาย class

### Scenario ที่ต้องรองรับ
- หุ่นยนต์บินไปยังตำแหน่งที่กำหนด
- ตรวจจับอุณหภูมิเพื่อค้นหามนุษย์
- ส่งข้อความรายงานพร้อมพิกัดปัจจุบัน
- ทุกการกระทำต้องใช้พลังงานจาก Battery

---

## Learning Objectives

- เข้าใจแนวคิด OOP เช่น Encapsulation, Inheritance, Polymorphism, Composition
- ออกแบบ class และ relationship อย่างถูกต้อง
- ใช้ Interface แทน Multiple Inheritance
- แยกระบบย่อยออกเป็นคลาสประกอบ (Composition)


## System Design

### Class Diagram (UML)



### Key Classes

- **RescueRobot** → คลาสหลัก ควบคุมการทำงานทั้งหมด
- **Battery** → จัดการพลังงาน (drain / charge)
- **GPSTracker** → จัดการพิกัดตำแหน่ง
- **ThermalCamera** → ตรวจจับอุณหภูมิ
- **Flyable / Movable / Communicable / Detectable** → กำหนดความสามารถผ่าน interface


## OOP Concepts Used

### Encapsulation
- ตัวแปรภายในคลาสถูกกำหนดเป็น `private`
- เข้าถึงผ่านเมธอดเท่านั้น
- ป้องกันการแก้ไขข้อมูลโดยตรง

### Inheritance
- RescueRobot implements หลาย interface
- แสดงแนวคิด multiple behavior inheritance

### Polymorphism
- ใช้การ override method จาก interface
- RescueRobot สามารถถูกมองเป็น Flyable หรือ Movable ได้

### Abstraction
- Interface กำหนดเฉพาะสิ่งที่ต้องทำ (method)
- ไม่เปิดเผยรายละเอียดภายใน

### Composition
- RescueRobot **has-a**
  - Battery
  - GPSTracker
  - ThermalCamera
- แทนการสืบทอดหลาย class

## การแก้ปัญหา Default Method ชื่อชนกัน

ถ้า interface สองตัวมี default method ชื่อเดียวกัน  
Java จะไม่สามารถตัดสินใจได้ว่าใช้ของใคร

วิธีแก้:
- Override method ใน RescueRobot
- หรือเลือกใช้ InterfaceName.super.method()

เพื่อป้องกันความกำกวม (Diamond Problem)

---

## How to Compile and Run

เปิด Terminal / Command Prompt
เข้าไปยังโฟลเดอร์โปรเจกต์ที่เก็บไฟล์ `.java`

### Java Example

```bash
javac *.java
java Main
