import java.util.Scanner;

import javax.swing.JOptionPane;

public class Day8 {

        public static void main(String[] args) {
            System.out.println("Hello Java");
        }

        Day8(){

        }
        void show(){

        }
}

class Student{
    int id;
    String name; 

    Student(int i, String n){
        id = i;
        name = n;
    }

    void show(){
        System.out.println("Student ID: " + id + "\nStudent Name: " + name + "\n=======================================================");
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ko Saw");
        Student s2 = new Student(202, "Ko Sai");
        s1.show();
        s2.show();

    }
}

class Employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;
    }

    void show(){
        System.out.println("Employee ID: " + id + "\nEmployee Name: " + name + "\nEmployee Salary: " + salary + "\n============================================");
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insert(101, "Ko Saw", 1500);
        e2.insert(202, "Ko Sai", 1800);
        e3.insert(303, "Ko Khin", 2500);

        e1.show();
        e2.show();
        e3.show();
    }
}

class Rectangle{
    int length;
    int width;

    void insert(int l, int w){
        length = l;
        width = w;
    }
    void calculateArea(){
        System.out.println(length * width);
    }
}

class TestRectabgle{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(),r2 = new Rectangle();

        r1.insert(11, 5);
        r2.insert(3, 15);

        r1.calculateArea();
        r2.calculateArea();

    }
}

//create Object

/***
 * 1, new keyword
 * 
 * 2, newinstance() method
 * 
 * 3, clone() method 
 * 
 * 4, deserialization 
 * 
 * 5, factory method
 */

 class Account {
    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt + " deposit");
    }

    void withdraw(float amt){
        if(amount<amt){
            System.out.println(amt + "Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdraw");
        }
           
    }

    void checkBalance(){
        System.out.println("Balance " + amount);
    }

    void show(){
        System.out.println("Account Number : " + acc_no + "\nAccount Name: " + name + "\nAccount Amount: " + amount + "\n========================================================");
    }
 }

 class TestAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account: ");
        int acc_no = scanner.nextInt();

        System.out.print("Enter Account Name: ");
        String name = scanner.next();

       

         System.out.print("Enter Account Amount: ");
    //    int amt =  Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Account Amount: ", "AMS LTD", 1));
        int amt = scanner.nextInt();

       
        Account a1 = new Account();
    
        a1.insert(acc_no, name, amt);
        a1.show();
        System.out.print("Enter Withdraw: ");
        float withdraw = scanner.nextFloat();
        a1.withdraw(withdraw);
        a1.checkBalance();
        a1.show();
        scanner.close();
    }
 }

 
