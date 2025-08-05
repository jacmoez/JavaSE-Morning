import 'dart:io';
import 'ProductServices.dart';

class Manageproducts {
  void showPMemenu() {
    while (true) {
      print("\n");
      print("----------------------------");
      print("|      Product Manager      |");
      print("----------------------------");
      print("[1] Add Product");
      print("[2] Delete Product");
      print("[3] View Products");
      print("[0] Back");
      stdout.write("Select a number: ");

      String? input = stdin.readLineSync();
      int? number = int.tryParse(input!);
      print("\n");

      switch (number) {
        case 1:
          print("Product Services Add Product...");
          print("\n");
          Productservices.addProduct();
          break;
        case 2:
          print("Product Services Delete Product...");
          Productservices.deleteProduct();
          break;
        case 3:
          print("----------------------------");
          print("|     Apple Inventory      |");
          print("----------------------------");
          Productservices.viewProducts();
          break;
        case 0:
          return;
        default:
          print("Invalid option. Try agin");
      }
    }
  }
}
