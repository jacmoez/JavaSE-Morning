class Programming {
  String language = "Java";
}

class Android extends Programming {
  @override
  String language = "Dart";
}

class Car {
  void run() {
    print("Car is မော်တော်ယဉ်။");
  }
}

class Toyotar extends Car {
  void run() {
    print("Toyotar car is ဈေးသက်သာတယ်။");
  }
}

class Bank {
  double getRateOfInterrest() {
    return 7;
  }
}

class Kbz extends Bank {
  @override
  double getRateOfInterrest() {
    return 8.5;
  }
}

class Aya extends Bank {
  double getRateOfInterrest() {
    return 9.0;
  }
}

class Cb extends Bank {
  double getRateOfInterrest() {
    return 8.7;
  }
}

void main(List<String> args) {
  var and = new Android();
  var car = new Toyotar();

  print("Android Development :${and.language} Language");
  car.run();

  print("=" * 33);
  var k = new Kbz();
  var a = new Aya();
  var c = new Cb();
  print("KBZ Bank Rate of Interest: ${k.getRateOfInterrest()} %.");
  print("Aya Bank Rate of Interest: ${a.getRateOfInterrest()} %.");
  print("CB Bank Rate of Interest: ${c.getRateOfInterrest()} %.");
}
