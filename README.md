Case Study: ระบบร้านกาแฟ Multi-Threaded
---
## Student Information
- Name: Piyawat Meetee
- Student ID: [68122250101]
- Submission Date: [18/02/2026]
---
Code

```java
public class CoffeeShop {
    public static void main(String[] args) {

        Thread t1 = new Thread(new CoffeeMaker("Espresso"));
        Thread t2 = new Thread(new CoffeeMaker("Latte"));
        Thread t3 = new Thread(new CoffeeMaker("Cappuccino"));

        t1.start();
        t2.start();
        t3.start();

        System.out.println("รับออเดอร์ครบแล้ว");
    }
}
```
---
