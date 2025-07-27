import "dart:io";

main() {
  print("မဂ်လာပါ ကြိုဆိုပါ၏၊");

  dynamic num = stdin.readLineSync();

  var number = int.parse(num);

  var i = 0;

  while (i < number) {
    print(i);
    i++;
  }

  bool con = true;

  while (con) {
    print("Insert your password");
    var input = stdin.readLineSync();

    if (input == '123') {
      con = false;
      print("Welcom back");
    } else {
      print("Password Wrong, try agin");
    }
  }
}
