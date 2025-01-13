//Java Satatic Method

class Student {
    int id;
    String name;
    static String school = "B.E.H.S.(1) Yangon";

    static void change(){
        school = "Mandalay";
    }

    Student(int i, String n){
        id = i;
        name = n;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudent School: " + school + "\n=================================");
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(101, "Maung Maung");
        Student s2 = new Student(202, "Aung Aung");
        Student s3 = new Student(303,"Ko Ko");

        s1.show();
        s2.show();
        s3.show();
    }
}

class Calculate{
   static int cube(int x){
       return x * x * x;
    }

    public static void main(String[] args) {
        int result = Calculate.cube(5);
        System.out.println(result);
    }
}

class A {
    static {
        System.out.println("static block is invoked");
    }

    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

//Java Nested Class
/**
 * 1, Static Nested Class
 * 
 * 2, Non-static Nested Class (Inner Class)
 * 
 * 3, Local Inner Class 
 * 
 * 4, Anomymous Inner Class 
 */


/**
 * this keywork
 * 1, refer current instance varaible
 * 2, current method
 * 3, this() current constructor
 * 4 , argnment in the method call
 * 5, afgnment in the construtor call
 * 6, current instance method
 */

 class Student2 {
    int id;
    String name;
    float fee;

    Student2(int id, String name, float fee){
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudent Fee: " + fee + "\n=================================");
    }
 }

 class TestStudent2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Maung Maung", 120000);
        Student2 s2 = new Student2(202, "Aung Aung", 150000);
        s1.show();
        s2.show();
    }
 }

 //this invoke current class method 

 class A1 {
    void m(){
        System.out.println("Hello M");
    }
    void n(){
        System.out.println("Hello N");
        this.m();
    }
 }

 class TestA1{
    public static void main(String[] args) {
        A1 a = new A1();
        a.n();
    }
 }

 //default constructor from parameterized constructor

 class A2 {
    A2(){
        System.out.println("Hello A2");
    }

    A2(int x){
        this();
        System.out.println(x);
    }
 }

 class TestA2 {
    public static void main(String[] args) {
        A2 a = new A2(10);
    }
 }

 class B {
    B1 obj;
    B(B1 obj){
            this.obj = obj;
    }

    void show(){
        System.out.println(obj.data);
    }
 }

 class B1 {
    int data = 10;
    B1(){
        B b = new B(this);
        b.show();
    }

    public static void main(String[] args) {
        B1 b = new B1();
    }
 }

 //Java Object getClass()

 class Object1 {
     public static void main(String[] args) {
        Object obj = new String("AMS LTD");
        Class a = obj.getClass();

        System.out.println("Class of Object is : " + a.getName());
     }
 }


 //OOP Concepts

 class ThisMethodParameter {
       int a,b;

       ThisMethodParameter(){
        a = 10;
        b = 20;
       }

       void show(ThisMethodParameter obj){
        System.out.println("a = " + a + " b = " + b);
       }

       void get(){
        show(this);
       }

       public static void main(String[] args) {
        ThisMethodParameter obj = new ThisMethodParameter();
        obj.get();
       }
 }

 class This2 {

    int a, b;

    This2(){
        this(10,20);
        System.out.println("Inside dafault constructor");
    }
    This2(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside Paramter constructor");
    }

    public static void main(String[] args) {
        This2 obj = new This2(10,20);
    }
 }


 //current method

 class This3 {
    void show(){
            this.display();
            System.out.println("Inside show method");
    }

    void display(){
        System.out.println("Inside display method");
    }

    public static void main(String[] args) {
        This3 obj = new This3();
        obj.show();
    }
 }

 class This4 {
    int a, b;

    This4(int a, int b){
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        This4 obj = new This4(10, 20);
        obj.show();
    }
 }

 //Inheritance Java
/**
 * Sub Class / Child Class 
 * 
 * Super Class / Parent Class
 */

 class Employee {
    float salary = 1200;
 }

 class Programmer extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bounus of Programmer is: " + p.bonus);
    }
 }

 //Type of Inheritance 
 /**
  * Signle
    Multilevel
    Hierchical
    Multiple
    Hybrid
  */

  class Animal {
    void eat(){
        System.out.println("eating....");
    }
  }

  class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
  }

  class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
  }

 //Multilevel Inheritance 
 class Animal1 {
    void eat(){
        System.out.println("eating....");
    }
  }

  class Dog1 extends Animal1{
    void bark(){
        System.out.println("barking...");
    }
  }

  class BabyDog extends Dog1{
    void sleep(){
        System.out.println("Sleeping...");
    }
  }

  class TestAnimal1 {
    public static void main(String[] args) {
       BabyDog d = new BabyDog();
       d.sleep();
       d.bark();
       d.eat();
    }
  }

  //Hierarchical Inheritance 

  class Animal2 {
    void eat(){
        System.out.println("eating....");
    }
  }

  class Dog2 extends Animal2{
    void bark(){
        System.out.println("barking...");
    }
  }

  class Cat extends Animal2{
    void meow(){
        System.out.println("meowing...");
    }
  }

  class TestAnimal2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d= new Dog();
        c.meow();
        c.eat();
        d.bark();
        d.eat();
    }
  }


  class C {
    void msg(){
        System.out.println("Hello");
    }
  }

  class D {
    void msg (){
        System.out.println("Hi");
    }
  }

  class E extends D{
    public static void main(String[] args) {
        
    }
  }
 