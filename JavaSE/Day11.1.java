public interface Animal {
    void eat();
    void sleep();
}

interface Printable {
    void print();
}

interface Drawable {
    void draw();
}

interface Bank {
    float rateOfInterest();
}

//Interface Inheritance
interface Printable1 {
    void print();
}

interface Showable1 extends Printable1{
    void show();
}

interface Showable2 {
    void show();
    default void msg(){
        System.out.println("default method");
    }
}

interface Drawable1 {
    void draw();
   static int cube(int x){
        return  x * x * x;
    }
}

//Nested Interface

interface Printable2 {
    void print();
    interface MessagePrintable {
        void msg();
    }
}

interface Animal1 {
    public void animalSound();
    public void sleep();
}

interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

interface TestInterface1 {
       final int a = 10;

       void show();
}

interface Car {

    //Abstract method defined
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
//class => class (extends), class => interface (implements), interface => interface (extends)