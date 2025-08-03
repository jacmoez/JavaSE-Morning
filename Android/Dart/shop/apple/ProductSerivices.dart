import 'dart:io';
import 'Product.dart';

class Productserivices {
  static final input = stdin;

  //View products
  static void viewProducts() {
    Product.initalizeProducts();
    for (var product in Product.products) {
      if (product != null) {
        print("ID: ${product.getId}");
        print("Name: ${product.getName}");
        print("Price: ${product.price}");
        print("Stock: ${product.getStock}");
        print("=" * 33);
      }
    }
  }

  //add products
  static void addProduct() {
    if (Product.productCount >= Product.products.length) {
      print('Procut list is full!.');
      return;
    }

    stdout.write("Enter Product Name: ");
    String? name = input.readLineSync();

    if (name == null || name.isEmpty) {
      print("Ivalid input for procut name.");
      return;
    }

    stdout.write("Enter Product Price: ");
    double? price = double.tryParse(input.readLineSync()!);

    if (price == null) {
      print("Ivalid input for procut price.");
      return;
    }

    stdout.write("Enter Product Stock: ");
    int? stock = int.tryParse(input.readLineSync()!);

    if (stock == null) {
      print("Ivalid input for procut sttock.");
      return;
    }

    Product.nextId++;
    var newProcut = Product(Product.nextId, name, price, stock);
    Product.products[Product.productCount] = newProcut;
    Product.productCount++;

    print("Product added with ID: ${newProcut.getId}");
  }

  //delete product
  void deleteProduct() {
    print("Delete Product Comming...");
  }

  //purchase products
  void purchaseProduct() {
    print("Purchase Products Comming...");
  }
}
