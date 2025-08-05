class Customer {
  String? name, email, username, password;

  static List<Customer?> customers = List.filled(10, null, growable: false);
  static int customerCount = 0;

  //Default Customer
  static void initalizeDafaultCustomer() {
    customers[0] = Customer("Ko Saw", "saw@ams.com.mm", "saw", "123");
    customerCount = 1;
  }

  //Constructor
  Customer(this.name, this.email, this.username, this.password);

  //Getters
  String? get getName => name;
  String? get getEmail => email;
  String? get getUsername => username;
  String? get getPassword => password;

  //view all customers
  static void viewCustomers() {
    initalizeDafaultCustomer();
    if (customerCount == 0) {
      print("No customers registered yet.");
      return;
    } else {
      print("Register Customer.");
    }

    for (int i = 0; i < customerCount; i++) {
      Customer? c = customers[i];
      if (c != null) {
        print("${i + 1}.Name: ${c.getName}");
        print("  Email: ${c.getEmail}");
        print("  Username: ${c.getUsername}");
        print("  Password: ${c.getPassword}");
        print("=" * 33);
      }
    }
  }
}
