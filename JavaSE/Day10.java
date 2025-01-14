class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

class Base2 {
   private final void msg(){
        System.out.println("Base class Message");
    }
}

class Inheritance1 extends Base2{

    private final void msg(){
        System.out.println("Child class Message");
    }
    public static void main(String[] args) {
        new Inheritance1().msg();
    }
}

class Base3{
    static String s = "";
    protected Base3(){
        s+= "Base Class Message!\n";
    }
}

class Child2 extends Base3{
    
    private Child2(){
        s+= "Child Class Message!";
    }
}

class Inheritance2 extends Base3{

   private Inheritance2(){
        s+=" Grand Child Cass Message!";
    }
    public static void main(String[] args) {
        new Inheritance2();
        System.out.println(s);
    }
}

//Aggregation 


class Operation{
    int square(int n){
        return n *n;
     }
}

class Cicle {
    Operation op; // aggregation
    float pi = 3.14f;

    float area(int radius){
        op = new Operation();
        int square = op.square(radius);
        return pi * square;
    }

    public static void main(String[] args) {
        Cicle c = new Cicle();
        float result = c.area(5);
        System.out.println(result);
    }
}

class Address {
    String city,state,country;

    public Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee1 {
    int id;
    String name;
    Address address;

    public Employee1(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void employeeInfo(){
        System.out.println("Employee ID: " + id + "\nEmployee Name: " + name + "\nEmployee Address: " + address.city +", " + address.state + ", " + address.country + "\n=====================================");
    }

    public static void main(String[] args) {
        Address address1 = new Address("Lathar", "Yangon", "Myanmar");
        Address address2 = new Address("Lanmathaw", "Rangoon", "Burma");

        Employee1 e1 = new Employee1(101, "Maung Maung", address1);
        Employee1 e2 = new Employee1(202, "Aung Aung", address2);

         e1.employeeInfo();
         e2.employeeInfo();
    }
}

//Method Overloading 

class Math1 {
    public int add(int a, int b){
        return a + b;
    }

    public float add(int a, float b){
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(float a, double b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public long add(long a, int b){
        return a + b;
    }

    public long add(long a, long b){
        return a + b;
    }

    public float add(long a, float b){
        return a + b;
    }

    public int add(int a, int b , int c){
        return a + b + c;
    }
}

class Add {
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
}

class TestAdd {
    public static void main(String[] args) {
        System.out.println(Add.add(10, 20));
        System.out.println(Add.add(10, 20,30));
    }
}

class Add2 {
    static int add(int a, int b){
        return a + b;
    }

    static double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(Add2.add(10, 20));
        System.out.println(Add2.add(10.5, 20.2));
    }
}

//Method Overriding 

class Computer {
    void run(){
        System.out.println("Computer is running");
    }
}

class Dell extends Computer{
    public static void main(String[] args) {
        Dell obj = new Dell();
        obj.run();
    }
}


class Dell2 extends Computer {
    void run(){
        System.out.println("Dell is running fast");
    }
    public static void main(String[] args) {
        Dell2 obj = new Dell2();
        obj.run();
    }

}

class Bank {
    int getRateOfInterest(){
        return 0;
    }
}

class Kbz extends Bank {
    int getRateOfInterest(){
        return 9;
    }
}

class Aya extends Bank {
    int getRateOfInterest(){
        return 8;
    }
}

class Cb extends Bank {
    int getRateOfInterest(){
        return 7;
    }
}

class TestBank {
    public static void main(String[] args) {
        Kbz k= new Kbz();
        Aya a = new Aya();
        Cb  c = new Cb();


        System.out.println("KBZ Bank Rate of Interest: " + k.getRateOfInterest() + "%");
        System.out.println("AYA Bank Rate of Interest: " + a.getRateOfInterest() + "%");
        System.out.println("CB Bank Rate of Interest: " + c.getRateOfInterest() + "%");
    }
}


class A {
    protected void msg(){
        System.out.println("Hello Java");
    }
}

class TestA extends A{
    // void msg(){
        
    //}
    public static void main(String[] args) {
        
    }
}


//Super Keywork
/**
 * parent class instance varaible
 * prent class method invoke
 * prent class constructor
 */

 class Animal {
    String color = "White";
    void eat(){
        System.out.println("eating...");
    }
 }

 class Dog extends Animal{
    String color = "Black";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    void eat(){
        System.out.println("Dog eating");
    }

     void work(){
        super.eat();
        bark();
     }

    void bark(){
        System.out.println("barking....");
    }
 }

 class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
        d.work();
    }
 }

 class Animal1 {
    Animal1(){
        System.out.println("animal is created");
    }
 }

 class Dog1 extends Animal1 {
    Dog1(){
        super();
        System.out.println("dog is created");
    }
 }

 class TestAnimal1 {
    public static void main(String[] args) {
        new Dog1();
    }
 }

 class Person {
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
 }

 class Employee2 extends Person{
    float salary;
    Employee2(int id, String name, float salary){
        super(id, name);
        this.salary = salary;
    }

    void employeeInfo(){
        System.out.println("Employee ID: " + id + "\nEmployee Name: " + name + "\nEmployee Salary: " + salary+ "\n=====================================");
    }
 }

 class TestPerson {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(101, "Maung Maung", 1200);
        Employee2 e2 = new Employee2(202, "Aung Aung", 1350);
        e1.employeeInfo();
        e2.employeeInfo();
    }
 }

 