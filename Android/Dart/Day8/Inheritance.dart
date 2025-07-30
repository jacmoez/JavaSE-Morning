class AA {
  String name = "မောင်မောင်";

  show() {
    print("Name is: $name");
  }
}

class BB {
  String name = "မောင်မောင်";

  show() {
    print("Name is: $name");
  }
}

class Employee {
  int salary = 2300;
}

class Programmer extends Employee {
  int bonus = 1000;
}

class Animal {
  void eat() {
    print("eating..");
  }
}

class Dog extends Animal {
  void bark() {
    print("Barking...");
  }
}

class BabyDog extends Dog {
  void sleep() {
    print("Sleeping...");
  }
}

class Cat extends Animal {
  void meow() {
    print("meowing...");
  }
}

void main() {
  var p = new Programmer();
  print("Programming salary is: ${p.salary}");
  print("Bounus Programmer is: ${p.bonus}");

  var g = new BabyDog();
  g.sleep();
  g.bark();
  g.eat();

  var c = new Cat();
  c.meow();
  c.eat();
}
