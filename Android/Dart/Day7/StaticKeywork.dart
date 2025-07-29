class Student {
  int id = 101;
  String name =
      "မောင်မောင်"; //instance variable, fields, Member Variable, properties
  static int age = 23; // class varraible

  a() {
    print("Non static Method");
  }

  static b() {
    print("static method");
  }
}

void main(List<String> args) {
  print(Student().id);
  print(Student().name);
  var s = new Student();
  s.a();
  print("Age is ${Student.age}");

  Student.b();
  print("=" * 33);

   new Counter();
   new Counter();
   new Counter();
}

class Counter {
  static int count = 0;

  Counter() {
    count++;
    print(count);
  }
}
