import javax.swing.JOptionPane;

public class Day7 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}

/***
 * OOP 
 * 
 * 
 * Naming Conventions 
 */


 class Dic {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Saw Book Shop");
        String name = JOptionPane.showInputDialog("Book Search");
      
        switch (name) {
            case "A":
                    JOptionPane.showConfirmDialog(null,"ပထမ စကားလုံး");
                break;
                case "B":
                JOptionPane.showConfirmDialog(null,"ဒုတိယ စကားလုံး");
            break;
            case "C":
                JOptionPane.showConfirmDialog(null, "တတိယ စကားလုံး");
            break;
            case "Apple":
             JOptionPane.showConfirmDialog(null, "Apple = ပန်းသီး။");
            break;
            case "Orange":
            JOptionPane.showConfirmDialog(null, "Orange = လိမ္မော်သီး။");
            break;
            default:
           JOptionPane.showConfirmDialog(null, "အဘိဓာန်ထဲတွင် မရှိသေးပါ၊");
                break;
        }


      
    }
 }
/***
 * Class Book {
 *   code snippet
 * }
 *  Interface Book {
 *  
 * }
 * 
 *  Method firstName34(){
 * 
 * }
 * MiddleName(){
 * 
 * }
 * 
 *  last_name(){
 *   
 * }
 * 
 * varaible int id;
 *  
 * package com.ams.basic
 * 
 * constant static finat int MIN_AGE = 18;
 *    
 * Class Member 
 *   1, Field, 2 Method, 3, Constructors, 4, Blocks, 5, Nested Class , Interface & Enu
 * 
 * Method 
 *   Code Reusablilty:
 * 
 *   Code Optimisation
 */

 class MyClass {

      int MyFiled;  

      public MyClass(int value){
        MyFiled = value;
      }

      public static void main(String[] args) {
        MyClass my = new MyClass(10);
        System.out.println("Value of myField: " + my.MyFiled);
      }
 }

 /**
  * Onject Initalizing
    1, By reference variable
    2, By method
    3, By constructor
  */


 //By Reference Vaiable
 class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 101;
        s1.name = "Ko Saw";

        s2.id = 202;
        s2.name = "Ko Sai";
        System.out.println("Student ID: "+s1.id);
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student ID: " + s2.id + "\nStudent Name: " + s2.name);
        
    }
 }

 // By Method
 class Student2 {
    int id;
    String name;

    void insertRecord(int i, String n){
        id = i;
        name = n;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\n===================================================");
    }
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.insertRecord(101, "Ko Saw");
        s2.insertRecord(202, "Ko Sai");
        s1.show();
        s2.show();
        
    }
 }

 // By Constructor
 class Student3 {
    int id;
    String name;

    Student3(int i, String n){
        id = i;
        name = n;
    }
    public static void main(String[] args) {
        Student3 s1 = new Student3(10,"Ko Saw");
        Student3 s2 = new Student3(202, "Ko Sai");
        Student3 s3 = new Student3(303, "Ko Khin");
        System.out.println("Student ID: " + s1.id + "\nStudent Name: " + s1.name);
        System.out.println("Student ID: " + s2.id + "\nStudent Name: " + s2.name);
        System.out.println("Student ID: " + s3.id + "\nStudent Name: " + s3.name);

    }
 }


 