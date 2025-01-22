package Day15;

import javax.swing.*;
import java.util.Scanner;

public class TypeCasting {
}

class Employee {
    int salary = 1000;
}

class Programmer extends  Employee{
     int bonus = 2000;
    public static void main(String[] args) {
        Employee emp = new Employee();
        Programmer pro = new Programmer();
        System.out.println(pro.bonus);
    }
}

abstract class Animal {
    public abstract void speak();
}

interface Swimable  {
        void swim();
}

class Dog extends Animal {
        public void speak(){
            System.out.println("wroof");
        }
}

class Cat extends Animal {
  public void speak(){
      System.out.println("meow..");
    }
}

class Duck extends Animal implements Swimable{
        public void speak(){
            System.out.println("Duck,,");
        }
        public void swim(){
            System.out.println("Duck swim");
        }
}

class Testing1 {
    public static void main(String[] args) {
    Swimable s = new Duck();
    Animal a3 = new Cat();
    Animal a2 = new Dog();
    Animal a1 = new Duck();
    s.swim();
    a1.speak();
    a2.speak();
    a3.speak();
    }
}

class Add{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"AMS LTD");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ပထမကိန်းကို ရိုက်ပေးပါ၊ "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ဒုတိယကိန်းကို ရိုက်ပေးပါ၊"));
//         int num1 = Integer.parseInt(strNum1);
//         int num2 = Integer.parseInt(strNum2);
         int result = num1 + num2;
         //JOptionPane.showMessageDialog(null,num1 + " + " + num2 + " = " + result);
        JOptionPane.showMessageDialog(null, "%d + %d = %d".formatted(num1,num2,result));
    }
}
