/**
 * 1, code Reusability
 * 
 * 2, Flexibility and Extensibility 
 */

class Calculation {
  int add(int a, int b) {
    return a + b;
  }

  double adds(double a, double b) {
    return a + b;
  }
}

class Car {
  void run() {
    print("Care is running");
  }
}

class Toyotar extends Car {
  void run() {
    print("running safely");
  }
}

class Bank {
  double getRateOfInterrest() {
    return 7;
  }
}

class Kbz extends Bank {
  @override
  double getRateOfInterrest() {
    return 8.5;
  }
}

class Aya extends Bank {
  double getRateOfInterrest() {
    return 9.0;
  }
}

class Cb extends Bank {
  double getRateOfInterrest() {
    return 8.7;
  }
}

class Shape {
  void draw() {
    print("drawing...");
  }
}

class Rectangle extends Shape {
  void draw() {
    print("drawing rectangle.");
  }
}

class Circle extends Shape {
  void draw() {
    print("drawing Circle...");
  }
}

class Triangle extends Shape {
  void draw() {
    print("drawing triangle...");
  }
}

class Animal {
  void eat() {
    print("animal is eating...");
  }
}

class Dog extends Animal {
  void eat() {
    print("dog is eating...");
  }
}

class BabyDog extends Dog {}

void main() {
  var c = new Toyotar();
  c.run();
  print("=" * 55);
  Bank b;
  b = new Kbz();
  print("KBZ Rate of Interst: ${b.getRateOfInterrest()} %.");
  b = new Aya();
  print("AYA Rate of Interst: ${b.getRateOfInterrest()} %.");
  b = new Cb();
  print("CB Rate of Interst: ${b.getRateOfInterrest()} %.");
  print("=" * 55);

  Shape s;
  s = new Rectangle();
  s.draw();
  s = new Circle();
  s.draw();
  s = new Triangle();
  s.draw();

  print("=" * 55);

  Animal a = new BabyDog();
  a.eat();
  // var c = new Calculation();
  // print(c.add(10, 20));
  // print(c.adds(10.5, 20.5));
}
