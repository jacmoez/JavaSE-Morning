import 'dart:io';

import 'Login.dart';
import 'ProductServices.dart';
import 'Transition.dart';

class CustomerMenu {
  //Method to show Customer Menu
  static void showMenu() {
    print("\n");
    print("----------------------------");
    print("|      Product Manager      |");
    print("----------------------------");
    print("[1] View Products");
    print("[2] Purchase Product");
    print("[3] View My Transacctions");
    print("[0] Logout");
  }

  //Method for Customer Menu Options
  static void options() {
    bool cMenuRunning = true;

    while (cMenuRunning) {
      showMenu();

      stdout.write("To get started, select a number: ");
      String? input = stdin.readLineSync();
      print("\n");

      int? number = int.tryParse(input!);

      switch (number) {
        case 1:
          print("----------------------------");
          print("|     Apple Inventory      |");
          print("----------------------------");
          Productservices.viewProducts();
          print("\n");
          break;

        case 2:
          print("----------------------------");
          print("|     Purchase Product     |");
          print("----------------------------");
          Productservices.purchaseProduct();
          print("\n");
          break;
        case 3:
          print("----------------------------");
          print("|      Transactions        |");
          print("----------------------------");
          Transition.viewCustomerTransaction(Login.loggedInCustomerName);
          print("\n");
          break;
        case 0:
          print("Logging Out...");
          cMenuRunning = false;
          Login.beginLogin();
          break;

        default:
          print("Invalid option. Try again.");
      }
    }
  }
}
