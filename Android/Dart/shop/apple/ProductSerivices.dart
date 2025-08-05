import 'dart:io';
import 'Product.dart';

class Productservices {
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
  static deleteProduct() {
    stdout.write("\nEnter Product ID to delete: ");
    int? idToDelete = int.tryParse(input.readLineSync()!);
    if (idToDelete == null) {
      print("Invalid ID input");
      return;
    }

    bool found = false;
    for (int i = 0; i < Product.productCount; i++) {
      var product = Product.products[i];

      if (product != null && product.getId == idToDelete) {
        //Shift left to fill gap

        for (int j = i; j < Product.productCount - 1; j++) {
          Product.products[j] = Product.products[j + 1];
        }

        Product.products[Product.productCount - 1] == null;
        Product.productCount--;
        print("Procut with ID ${idToDelete} delete.");
        found = true;
        break;
      }
    }

    if (!found) {
      print("Product not found");
    }
  }

  //purchase products
  static void purchaseProduct() {
    print("Purchase Products Comming...");
    print("\n");

    stdout.write("Here are out aviilable product: ");
    viewProducts();

    print("\n");

    print("How many different product do you want to buy? ");
    int? numberOfItems = int.tryParse(input.readLineSync()!);

    if (numberOfItems == null || numberOfItems <= 0) {
      print("Invalid number of items.");
      return;
    }

    double total = 0.0;

    for (int i = 0; i < numberOfItems; i++) {
      stdout.write("Enter Product ID: ");
      int? productID = int.tryParse(input.readLineSync()!);
      if (productID == null) {
        print("Invalid Product ID.");
        continue;
      }

      stdout.write("Enter Quantity: ");
      int? quantity = int.tryParse(input.readLineSync()!);
      if (quantity == null) {
        print("Invalid Quantity.");
        continue;
      }

      Product? selectProduct;

      for (var product in Product.products) {
        if (product != null && product.getId == productID) {
          selectProduct = product;
          break;
        }
      }

      if (selectProduct == null) {
        print("Product ID not found.");
        continue;
      }

      if (selectProduct.getStock >= quantity) {
        int newStock = selectProduct.getStock - quantity;
        selectProduct.setStock(newStock);

        double itemTotal = selectProduct.getPrice * quantity;
        total += itemTotal;

        print(
          "Purchased  ${selectProduct.getName} x ${quantity} ${selectProduct.getPrice.toStringAsFixed(2)} each = \$${itemTotal.toStringAsFixed(2)}",
        );

        //Pending Transaction
      } else {
        print("Not enough stock for ${selectProduct.getName}");
      }
      print("\n");
    }

    print("Total Amount Due: \$${total.toStringAsFixed(2)}");
  }
}
