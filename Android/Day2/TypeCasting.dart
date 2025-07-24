void main() {
  var age = 23;

  var stringAge = age.toString();

  var name = "23"; // String data type

  int intName = int.parse(name); //String to Integeger 20 => Number Type

  print(stringAge.runtimeType);
  print(age.runtimeType);
  print(name.runtimeType);
  print(intName.runtimeType);

  var height = 5.3;
  name = "Ko Ko Aung";

  print("Name is " + name + ". Height is: " + height.toString());
  print("Name is ${name}. Height is: ${height.toString()}");
}
