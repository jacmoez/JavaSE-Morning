import 'dart:io';

import 'AdminMenu.dart';

class Login {
  //The default Admin username & password
  static String adminUsername = "admin";
  static String adminPassword = "123";
  static String loggedInCustomerName = "";

  //This method starts the Login
  static void beginLogin() {
    bool exiteProgram = false;

    while (!exiteProgram) {
      print("Welcome To Apple Store System");
      print("Select an Option:!");
      print("[1] Admin");
      print("[2] Customer");
      print("[3] Exit");

      stdout.write("Enter choice [1-3]: ");

      String? input = stdin.readLineSync();
      int? startChoice = int.tryParse(input!);

      switch (startChoice) {
        case 1: //Admin Login
          bool loggedInAdmin = false;

          while (!loggedInAdmin) {
            stdout.write("\nAdmin Username: ");
            String? adminUsernameInput = stdin.readLineSync();
            if (adminUsernameInput == null) break;

            stdout.write("Admin Password: ");
            String? adminPasswordInput = stdin.readLineSync();
            if (adminPasswordInput == null) break;

            if (adminUsername == adminUsernameInput &&
                adminPasswordInput == adminPassword) {
              print("\nAccess Granted! Welcome, Admin ");
              loggedInAdmin = true;

              Adminmenu.options();

              exiteProgram = true;
            } else {
              print("\nIncorrect username or password.");
              print("1. Try Again");
              print("2. Back to start");
              stdout.write("Enter you choice (1-2): ");

              String? incorrectInput = stdin.readLineSync();
              if (incorrectInput == '2') break;
            }
          }
          break;

        case 2: //Customer Menu
          print("\nCustomer Menu");
          print("[1] Login");
          print("[2] Sign Up");
          print("[3] Back");

          stdout.write("Enter choice [1-3]: ");
          int? customerChoice = int.tryParse(stdin.readLineSync()!);

          if (customerChoice == 1) {
            //Customer Login
            bool loggedInCustomer = false;

            while (!loggedInCustomer) {
              stdout.write("Customer Username: ");
              String? customerUsernameInput = stdin.readLineSync();
              if (customerUsernameInput == null) break;

              //bool customeFound = false;
            }
          }
          exiteProgram = true;
          break;

        case 3:
          print("Thank you for visiting the Apple Store!");
          exiteProgram = true;
          break;

        default:
          print("Ivalid option. Try again.");
      }
    }
  }
}
