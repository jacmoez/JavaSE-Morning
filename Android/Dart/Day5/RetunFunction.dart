void main() {
  var data = show();

  print(data);

  var fa = factorial(6);
  print(fa);

  printMsg();

  print(test());
}

String show() {
  return "I am Show Function";
}

factorial(number) {
  if (number <= 0) {
    return 1;
  } else {
    return (number * factorial(number - 1));
  }
}

//Lambda Functions

printMsg() => print("မဂ်လာပါ။");

int test() => 123;
