void main() {
  //print("မဂ်လာပါ။"); // " " Double Quotes ' '
  print(23); // Number

  var x = 20;
  int y = 30;

  int z = x + y;
  print(z);

  var city = "Malaysis";
  var height = 5.3;
  print(city);
  print(height);

  //Hello
  // H -> Character
  // e -> Character

  var name = "Hello Android Devveloper!";

  print(name[name.length - 1]);

  for (int i = 0; i < name.length; i++) {
    print(name[i]);
  }

  show();
}

void show() {
  print("I'm show method");
  int price = 250;

  print("Current price: ${price}");
  print("Current price: ${price}");
  print("Current price: ${price}");
  print("Current price: ${price}");
  print("Current price: ${price}");
  print("Current price: ${price}");

  var name = 'Maung Aung';
  var age = 23;
  var monery = 2.5;

  print(name.runtimeType);
  print(age.runtimeType);
  print(monery.runtimeType);

  String name1 = "Aung Aung";
  int age1 = 25;
  double monery1 = 12.4;

  print(name1);
  print(age1);
  print(monery1);

  int age2; //declear

  age2 = 10; //assign
  age2 = 20; //reassign
  age2 = 30; //reassign

  print(age2); //update 
}

class StockList {
  var firstName = "Maung Maung";
  var lastName = "Soe";
}
