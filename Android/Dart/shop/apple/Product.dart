class Product {
  int id;
  String name;
  double price;
  int stock;

  // Static product List
  static List<Product?> products = List.filled(10, null, growable: false);
  static int productCount = 3;
  static int nextId = 3;

  static void initalizeProducts() {
    
    products[0] = Product(1, "iPhone 15", 999.99, 10);
    products[1] = Product(2, "MacBook Air", 1299.99, 5);
    products[2] = Product(3, "iPad Air", 1199.99, 8);
  }

  //Constructor
  Product(this.id, this.name, this.price, this.stock);

  //Getters
  int get getId => id;
  String get getName => name;
  double get getPrice => price;
  int get getStock => stock;

  //Setter
  void setStock(int stock) {
    this.stock = stock;
  }
  
}
