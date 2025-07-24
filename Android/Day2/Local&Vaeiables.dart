var course = "Android Development"; // Global Variable => Global scope

void main() {
  var name = "Ko Saw"; // Local Variable => Local Scope 
  print(name);

  String greets = name + " name";
  print(greets);
  print("Course is: ${course}");
  greet();
}

void greet() {
  String name = "Ko Hla";
  print(name);
  print("Course is: ${course}");
}
