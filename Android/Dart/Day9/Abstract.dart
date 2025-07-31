/**
 * Voucher 
 * 1, Printer Driver 
 * 2, printer name 
 * 3, printer busy  
 * 4, printer queue 
 * 5, printer output 
 * 6, printer API success / fail 
 * 
 * print()
 */

abstract class Car {
  run();
  void info() {}
}

class Honda extends Car {
  @override
  void run() {
    print("Car is running");
  }
}

abstract class Bank {
  double getRateOfInterest();
}

class Kbz extends Bank {
  @override
  double getRateOfInterest() {
    return 7.5;
  }
}

class Aya extends Bank {
  @override
  double getRateOfInterest() {
    return 8.0;
  }
}

void main(List<String> args) {
  var c = new Honda();
  c.run();
  Bank b;
  b = new Kbz();
  print("Rate of Interest is: ${b.getRateOfInterest()}%");
  b = Aya();
  print("Rate of Interest is: ${b.getRateOfInterest()}%");
}
