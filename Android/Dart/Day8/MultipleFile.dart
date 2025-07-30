import 'Inheritance.dart';
import '../Day7/SetterAndGetter.dart';

void main(List<String> args) {
  AA a = new AA();
  a.show();

  var e = new Employee();
  print(e.salary);

  var m = new Main();
  m.setName("ကိုကိုစော");
  m.setAge(32);

  print(m.getName());
  print(m.getAge());
}
