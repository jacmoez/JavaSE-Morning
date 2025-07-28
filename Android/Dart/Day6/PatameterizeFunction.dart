main() {
  myName("မောင်မောင်", 23, "KL");
  myName(23, "KL", "မောင်မောင်");
  nameParameters n = new nameParameters();
  n.nameParameter();
  n.show("Mobile Developer", "Flutter");
}

void myName(name, age, city) {
  print("Name is $name and Age is $age city is $city");
}

class nameParameters {
  void nameParameter() {
    second(age: 23, name: "ကိုကိုစော");
  }

  void second({name = "မောင်မောင်", age = 18, city = "မလေးရှား"}) {
    print("Name is $name and Age is $age city is $city");
  }

  void show([skill = "Android", language = "Java"]) {
    print("My skill ${skill} and Programming Language is $language.");
  }
}

/**
 * Positional Patmeter
 * 
 * Name Parameter
 * 
 * Default Parameter 
 * 
 * Optional Parameters 
 */
