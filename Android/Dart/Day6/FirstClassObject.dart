main() {
  result(answer); //answer => first class object

  var skills = [
    "Java",
    "MySQL",
    "Dart",
    "Flutter",
    "Nodejs",
    "Spring",
    "DevOp",
  ];

  skills.forEach((a) => print(a));

  a1();

  print(add(10, 20));

  net();
}

void result(res) {
  res(20);
}

void answer(name) {
  print("Age is $name");
}

var a1 = () => print("Hello ");

var add = (a, b) => a + b;

void net() {
  //var lcope = "This is main local scrope";

  void net1() {
    var net1 = "This is net1 scrope";
    print(net1);
  }

  net1();
}
