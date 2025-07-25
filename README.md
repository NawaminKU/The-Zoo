# The-Zoo
Inheritance design pattern 

## เป้าหมาย: 
สร้างโครงสร้างของคลาสสัตว์ต่างๆ โดยใช้ทั้ง Abstract Class เพื่อสืบทอดคุณสมบัติร่วม และ Interface เพื่อกำหนดพฤติกรรมหรือความสามารถพิเศษที่ไม่ได้มีในสัตว์ทุกชนิด

## ส่วนที่ 1: การสร้างลำดับชั้นของสิ่งมีชีวิต (Inheritance)

สร้าง Animal (Abstract Class):
- ให้เป็นคลาสแม่ของสัตว์ทุกชนิด
- มี private final String name; และ constructor เพื่อรับค่า
- มีเมธอด public String getName()
- มี abstract method ชื่อ public abstract String makeSound(); เพื่อบังคับให้คลาสลูกต้องมีเสียงร้องของตัวเอง
สร้าง Mammal และ Bird:
- ให้คลาสทั้งสอง extends Animal
- Implement เมธอด makeSound() ให้คืนค่าเสียงร้องทั่วไปของสัตว์แต่ละประเภท (เช่น "Mammal sound", "Bird chirp")

## ส่วนที่ 2: การกำหนดความสามารถพิเศษ (Interfaces)

สร้าง Flyable (Interface):
- เป็นพฤติกรรมสำหรับสัตว์ที่บินได้
- มีเมธอด public String fly();
สร้าง Swimable (Interface):
- เป็นพฤติกรรม สำหรับสัตว์ที่ว่ายน้ำได้
- มีเมธอด public String swim();

## ส่วนที่ 3: การสร้างสัตว์ชนิดต่างๆ (Putting It All Together)

ตอนนี้ให้สร้างคลาสของสัตว์แต่ละชนิดโดยเลือก extends และ implements ให้เหมาะสมLion:
- extends Mammal
- Override makeSound() ให้คืนค่า "Roar!"

Eagle:
- extends Bird
- implements Flyable
- Override makeSound() ให้คืนค่า "Screech!"
- Implement fly() ให้คืนค่า "The eagle soars through the sky."

Penguin:
- extends Bird
- implements Swimmable
- Override makeSound() ให้คืนค่า "Squawk!"
- Implement swim() ให้คืนค่า "The penguin dives gracefully in the water."

Dolphin:
- extends Mammal
- implements Swimmable
- Override makeSound() ให้คืนค่า "Clicking sounds"
- Implement swim() ให้คืนค่า "The dolphin playfully swims in the sea."

## ส่วนที่ 4: การใช้งานในสวนสัตว์ (Polymorphism)
สร้างคลาส Zoo ที่มีเมธอด main เพื่อทดสอบการทำงานสร้าง ArrayList<Animal>:
- สร้าง ArrayList ที่เก็บ Animal แล้วเพิ่มอ็อบเจกต์ของสัตว์ทั้งหมดที่คุณสร้าง (Lion, Eagle, Penguin, Dolphin) เข้าไปในลิสต์เดียวกัน
- ทดสอบพฤติกรรมร่วม (จาก Inheritance):
- วนลูปในลิสต์ Animal ของคุณ
- ในแต่ละรอบ ให้พิมพ์ชื่อและเสียงร้องของสัตว์ (animal.getName() และ animal.makeSound())
- สังเกตว่า Polymorphism ทำให้เมธอด makeSound() ของคลาสที่ถูกต้องถูกเรียกใช้โดยอัตโนมัติ

ทดสอบความสามารถพิเศษ (จาก Interface):
- วนลูปในลิสต์ Animal อีกครั้ง
- ในแต่ละรอบ ให้ใช้ instanceof เพื่อตรวจสอบว่าสัตว์ตัวนั้นมีความสามารถพิเศษหรือไม่ และสั่งให้มันแสดงความสามารถนั้น แต่ถ้าไม่มีความสามารถใดๆ ให้เขียนว่ากำลังเดินเล่นในสวนสัตว์