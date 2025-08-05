import 'dart:io';

import 'Customer.dart';
import 'Login.dart';
import 'ManageProducts.dart';

class Adminmenu {
  static void showMenu() {
    print("=" * 25);
    print(" \uD83c\uDF4E Admin Dashboard");
    print("=" * 25);
    print(
      "(1) Manage Products\n(2) View Customer Accounts\n(3) View Transactions\n(0) Logout",
    );
  }

  static void options() {
    bool aMenuRunning = true;

    while (aMenuRunning) {
      showMenu();

      stdout.write("To get started, select a number: ");
      String? input = stdin.readLineSync();
      print("\n");

      int? number = int.tryParse(input!);

      switch (number) {
        case 1:
          //Send Admin to Product Management Panel
          print("Manage Prodcts show Menue...");
          new Manageproducts().showPMemenu();
          break;

        case 2:
          print("----------------------------");
          print("|     Customer Accounts    |");
          print("----------------------------");
          print("Customer View Customer...");
          print("\n");
          Customer.viewCustomers();
          break;

        case 3:
          print("----------------------------");
          print("|       Transactions       |");
          print("----------------------------");
          print("Transactions View All Transactions...");
          print("\n");
          break;

        case 0:
          stderr.writeln("Loggin out...");
          aMenuRunning = false;
          Login.beginLogin();
          break;
        default:
          print("Invalid option. Try agin.");
      }
    }
  }
}
