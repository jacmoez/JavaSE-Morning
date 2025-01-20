public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

abstract class Abstract{
    void show(){
        System.out.println("This show method!");
    }

    abstract void add();
    public static void main(String[] args) {

    }
}


class TestInterface implements Animal{
   public void eat(){
       System.out.println("This eating");
    }

    public  void sleep(){
        System.out.println("This sleeping");
    }

    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.eat();
        obj.sleep();
    }
}

class TestPrintable implements  Printable{
    public void print(){
        System.out.println("Hello Java Developer!");
    }

    public static void main(String[] args) {
        TestPrintable obj = new TestPrintable();
        obj.print();
    }
}

class Rectangle implements Drawable {
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw(){
        System.out.println("drawing circle");
    }
}

class TestDrawable {
    public static void main(String[] args) {
        Drawable obj = new Rectangle();
        Circle c = new Circle();
        obj.draw();
        c.draw();
    }
}

class Kbz implements Bank {
    public float rateOfInterest(){
        return  9.5f;
    }
}

class Aya implements Bank {
    public float rateOfInterest(){
        return  9.4f;
    }
}

class Cb implements Bank {
    public float rateOfInterest(){
        return 8.7f;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank k = new Kbz();
        Bank a = new Aya();
        Bank c = new Cb();
        System.out.println("KBZ Bank Return Of Interest: " + k.rateOfInterest() + "%.");
        System.out.println("AYA Bank Return Of Interest: " + a.rateOfInterest() + "%.");
        System.out.println("CB Bank Return Of Interest: " + c.rateOfInterest() + "%.");
    }
}

class TestDrawingPrintable implements  Drawable, Printable{
    public void draw(){
        System.out.println("This Draw Method");
    }
    public void print(){
        System.out.println("This is print Method");
    }

    public static void main(String[] args) {
        TestDrawingPrintable t = new TestDrawingPrintable();
        t.draw();
        t.print();
    }
}

class TestPrintable1 implements Showable1 {
    public void print(){
        System.out.println("This is print method");
    }
    public void show(){
        System.out.println("This is show method");
    }

    public static void main(String[] args) {
        TestPrintable1 t = new TestPrintable1();
        t.print();
        t.show();
    }
}

class TestShowable2 implements Showable2 {
    public void show(){
        System.out.println("This is Showable2 ");
    }

    @Override
    public void msg(){
        System.out.println("This Message Method!");
    }
    public static void main(String[] args) {
        TestShowable2 t = new TestShowable2();
        t.show();
        t.msg();
    }
}

class TestDrawable1 {
    public static void main(String[] args) {
        System.out.println(Drawable1.cube(3));
    }
}

class TestPrintable2 implements Printable2, Printable2.MessagePrintable {
    public void print(){
        System.out.println("This is print method");
    }

    public void msg(){
        System.out.println("This is msg method");
    }

    public static void main(String[] args) {
        TestPrintable2 t = new TestPrintable2();
        t.print();
        t.msg();
    }
}

class Pig implements  Animal1 {
    public void animalSound(){
        System.out.println("The pig says");
    }

    public void sleep(){
        System.out.println("Zzz");
    }
}

class TestAnimal1 {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod(){
        System.out.println("Some Text...");
    }
    public void myOtherMethod(){
        System.out.println("Some other text...");
    }
}

class TestDemoClass {
    public static void main(String[] args) {
        DemoClass d = new DemoClass();
        d.myMethod();
        d.myOtherMethod();
    }
}

class TestClass implements TestInterface1 {
        @Override
        public void show(){
            System.out.println("Hello Java Developer");
        }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.show();
    }
}

class Toyotar implements Car{
    int speed;
    int gear;


    public void changeGear(int newGear){
        gear = newGear;
    }

   public void speedUp(int increment){
        speed = speed + increment;
    }

    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
}

class TestCar{
    public static void main(String[] args) {
        Toyotar t = new Toyotar();
       t.changeGear(2);
       t.speedUp(3);
       t.applyBrakes(1);
        System.out.println("Toyotar Car Gear: " + t.gear);
        System.out.println("Toyotar Car Speed: " + t.speed);
        System.out.println("Toyotar Car Brake: " + t.speed);
    }
}