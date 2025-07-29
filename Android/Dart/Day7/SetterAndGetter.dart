class Main {
  var name, age;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  void setAge(int age) {
    this.age = age;
  }

  int getAge() {
    return this.age;
  }
}

main() {
  Main m = new Main();
  m.setName("မောင်မောင်");
  m.setAge(23);
  print(m.getName());
  print(m.getAge());
  print("=" * 55);

  Account a = new Account();
  a.setAcc_no(200233423);
  a.setName("မောင်မောင်");
  a.setEmail("maung@ams.com.mm");
  a.setAmount(12000);

  print(a.getAcc_no());
  print(a.getName());
  print(a.email);
  print(a.amount);
}

class Account {
  var acc_no, name, email, amount;

  void setAcc_no(int acc_no) {
    this.acc_no = acc_no;
  }

  int getAcc_no() {
    return acc_no;
  }

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }

  void setEmail(String email) {
    this.email = email;
  }

  String getEmail() {
    return email;
  }

  void setAmount(double amount) {
    this.amount = amount;
  }

  double getAmount() {
    return amount;
  }

  void accountShow() {
    print("$getAcc_no() $getName() $getEmail() $getAmount()");
  }
}
