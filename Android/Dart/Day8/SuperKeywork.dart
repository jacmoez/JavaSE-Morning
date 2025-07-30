class Android {
  programming() {
    print("Android Development Java Language");
  }
}

class Flutter extends Android {
  @override
  programming() {
    super.programming();
    print("Android Developmnet Dart Language");
  }
}

class Animal {
  String color = "White";

  void eat() {
    print("eating");
  }
}

class Dog extends Animal {
  String color = "Black";

  void printColor() {
    print(color);
    print(super.color);
  }

  void eat() {
    print("Dog is eating...");
  }

  void bark() {
    print("braking...");
  }

  void work() {
    bark();
    super.eat();
  }
}

void main(List<String> args) {
  var f = new Flutter();
  f.programming();

  var g = new Dog();
  g.printColor();
  g.work();
}
