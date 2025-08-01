import 'dart:io';

void main(List<String> args) {
  print("Will sleep 5 second");
  sleep(Duration(seconds: 3));
  print("This is after sleeping 5 seconds");

  var skill = ["Java", "Dart", "Flutter", "DBMS", "Spring", "DevOp"];

  skill.forEach((a) {
    sleep(Duration(seconds: 2));
    print(a);
  });
}
