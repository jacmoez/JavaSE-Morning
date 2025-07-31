mixin Student {
  String name = "မောင်မောင်";

  void show() {
    print("Student Name: $name");
  }
}

class Course with Student {}

void main(List<String> args) {
  var c = new Course();
  print(c.name);
  c.show();
}


/**
 * implements => Interface
 * Extends => class, abstract class 
 * with => mixing 
 */