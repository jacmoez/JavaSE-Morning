/**
 * 
 * Bitwise Operator
 * 
 * | , &, ^, ~
 * 
 * Logical Opetator &&, ||, !
 * 
 * (&&, ||,! ) လဆန်း, လ္ဆန်း, အခဏ်း (၁)၊ အခန်း (၁)၊ မန္တလေး၊
 * 
 */

void main() {
  int a = 10;
  int b = 5;
  int c = 20;
  if ((a < b) && (++a < c)) {
    print("If block is executed");
  } else {
    print("else block is executed");
  }
  print("The value is a is: ${a}");

  //OR
  print(a > b || a++ < c);

  //NOT

  print(!(a > b));

  //Ternary Operator

  var d = 2;

  var e = 5;

  var min = (d < e) ? d : e;
  print(min);

  int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

  print(max);

  //(Exp) ? True : False;
}
