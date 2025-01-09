class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        Main m = new Main();
        System.out.println(m.add());
    }

    int add(){
        int a = 10;
        int b = 20;
        return a + b;
    }
}
/**
 * Constructor 
 * 1. smae class name
 * 2. not return type
 * 3, cannot abstract, static, final, synchtonized
 * 
 * Type Constructors
 * 1, Default Constructors (no-arg constructor)
 * 2, Paramererized Constructor
 */

 class Phone{
    Phone(){
        System.out.println("My Phone: Redmi");
    }
    public static void main(String[] args) {
        Phone p = new Phone();
    }
 }

 class Student {
    int id;
    String name;

    void show(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.show();
        s2.show();
    }
 }

 class Student1 {
    int id;
    String name;

    Student1(int i, String n){
        id = i;
        name = n;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStdent Name: " + name );
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Ko Saw");
        Student1 s2 = new Student1(202, "Ko Sai");
        s1.show();
        s2.show();
    }
 }
//Constrouctor Over loading
 class Student2 {
    int id;
    String name;
    int age;

    Student2(int i, String n){
        id = i;
       name = n;
    }

    Student2(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name +"\nStudnet Age: " + age +"\n======================================================");
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Ko Saw");
        Student2 s2 = new Student2(202, "Ko Sai", 15);
        s1.show();
        s2.show();
    }
 }

 class Phone1 {
    String brand;
    String model;
    int storage;

    Phone1(String brand, String model, int storage){
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    void phoneInfo(){
        System.out.println("Phone Brand: " + brand + "\nPhone Model: " + model + "\nPhone Storage: " + storage + "\n==========================================");
    }
 }

 class TestPhone1 {
    public static void main(String[] args) {
        Phone1 p1 = new Phone1("Iphone", "Iphone XR", 128);
        Phone1 p2 = new Phone1("Redmin", "Note 13 Pro", 256);
        p1.phoneInfo();
        p2.phoneInfo();;
    }
 }

 class Student3 {
    int id;
    String name;

    Student3(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student3(Student3 s3){
        this.id = s3.id;
        this.name = s3.name;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStdent Name: " + name );
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(101,"Ko Saw");
        Student3 s2 = new Student3(s1);
        s1.show();
        s2.show();
    }

 }

 //Without Constructor Value 

 class Student4 {
    int id;
    String name;
    Student4(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student4(){}

    void show(){
        System.out.println("Student ID: " + id + "\nStdent Name: " + name );
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4(101,"Ko Saw");
        Student4 s2 = new Student4();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.show();
        s2.show();
    }
 }

//Java Static Keywork 
/**
 * 1, Variable
 * 2, Method
 * 3, Block
 * 4, Nested Class
 */

 class Student5 {
    int id;
    String name;
    static String school = "B.E.H.S(1) Yangon"; //static variable

    Student5(int id, String name){
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\nStudent School: " + school);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(101, "Ko Saw");
        Student5 s2 = new Student5(202, "Ko Sai");
        Student5.school = "B.E.H.S(1) Mandalay";
        s1.show();
        s2.show();
    }
 }

 class Counter{
    static int count = 0;

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter(); 
    
        Counter c2 = new Counter(); 
       
        Counter c3 = new Counter(); 
       
    }
 }

