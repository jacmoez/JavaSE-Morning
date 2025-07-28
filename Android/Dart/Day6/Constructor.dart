class Car {
  Car() {
    print("Car is မော်တော်ယာဉ်။");
  }
}

class Student {
  var id, name;

  void show() {
    print("Student Id: $id.\nStudent Name: $name");
  }
}

class Student2 {
  var id, name;

  Student2(int i, String n) {
    id = i;
    name = n;
  }

  void show() {
    print("Student ID: $id.\nStudent Name: $name.");
  }
}

void main() {
  new Car();
  Student s1 = new Student();
  Student s2 = new Student();
  s1.show();
  s2.show();

  Student2 s3 = new Student2(101, "မောင်မောင်");
  Student2 s4 = new Student2(202, "အောင်အောင်");
  s3.show();
  s4.show();
}
