void main(List<String> args) {
  Calculator c = new Calculator();
  print("The total: ${c.retTot()}.");
   print("The Discount: ${c.retDis()}.");
}

class CalculatTotal {
  retTot() {}
}

class CalculateDiscount {
  retDis() {}
}

class Calculator implements CalculatTotal, CalculateDiscount {
  @override
  int retTot() {
    return 1000;
  }

  @override
  int retDis() {
    return 50;
  }
}
