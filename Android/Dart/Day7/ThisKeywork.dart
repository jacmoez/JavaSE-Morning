class Main {
  String name = "မောင်မောင်";

  show(name) {
    this.name = name;
    print(this.name);
  }
}

void main(List<String> args) {
  Main m = new Main();
  m.show(m.name);

  Student s1 = new Student(101, "မောင်မောင်", 200);

  s1.show();

  A a = new A();
  a.n();
}

class Student {
  var id, name, fee;

  Student(int id, String name, double fee) {
    this.id = id;
    this.name = name;
    this.fee = fee;
  }

  void show() {
    print("Student Id: $id\nStudent Name: $name\nStudent Fee: $fee.");
  }
}

class A {
  void m() {
    print("Hello m");
  }

  void n() {
    print("Hello n");
    this.m();
  }
}
